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
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {
    private static final String path = "D:\\JavaProjects\\training\\JWD_Task01_OOP\\jwd-task01-template\\src\\main\\resources\\appliances_db.txt";

    @Override
    public <E> Appliance find(Criteria<E> criteria) {
        String applianceType = criteria.getApplianceType();
        BufferedReader bufferedReader = null;
        Appliance appliance = null;
        Command command = new ApplianceDirector().getCommand(applianceType);
        ParserCommand parserCommand = new ParseDirector().getParserCommand(applianceType);
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
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
        if (!line.contains(criteriaType)) {
            return false;
        }

        Map<E, Object> allCriteria = criteria.getAllCriteria();

        for (Object key : allCriteria.keySet()) {
            String value = ParameterValueFounder.findValue(line, key.toString());
            if (!value.equalsIgnoreCase(String.valueOf(allCriteria.get(key)).trim())) {
                return false;
            }
        }
        return true;
    }
}