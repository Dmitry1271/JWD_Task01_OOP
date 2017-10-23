package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.creator.ApplianceDirector;
import by.tc.task01.dao.creator.Command;
import by.tc.task01.dao.parse.ParseDirector;
import by.tc.task01.dao.parse.ParserCommand;
import by.tc.task01.dao.helpaction.ParameterValueFounder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {
    private static final String path = "/appliances_db.txt";

    @Override
    public <E> Appliance find(Criteria<E> criteria) {
        String applianceType = criteria.getApplianceType();
        BufferedReader bufferedReader = null;
        ClassLoader classLoader = getClass().getClassLoader();
        Appliance appliance = null;
        Command command = new ApplianceDirector().getCommand(applianceType);
        ParserCommand parserCommand = new ParseDirector().getParserCommand(applianceType);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(ApplianceDAO.class.getResourceAsStream(path)));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (!"".equals(line) && isFound(criteria, applianceType, line)) {
                    List<String> parameters = parserCommand.execute(line);
                    appliance = command.execute(parameters);
                    break;
                }
            }
        } catch (IOException e) {
            return null;
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
        return appliance;
    }

    private static <E> boolean isFound(Criteria<E> criteria, String criteriaType, String line) {
        if (!line.matches("^" + criteriaType + " : .+;$")) {
            return false;
        }

        Map<E, Object> allCriteria = criteria.getAllCriteria();
        String value;

        for (Object key : allCriteria.keySet()) {
            value = ParameterValueFounder.findValue(line, key.toString());

            if(allCriteria.get(key) instanceof Double){
                value = String.valueOf(Double.parseDouble(value));
            }

            if (!value.equalsIgnoreCase(String.valueOf(allCriteria.get(key)).trim())) {
                return false;
            }
        }
        return true;
    }
}