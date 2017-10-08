package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.helpaction.ApplianceCreator;
import by.tc.task01.dao.helpaction.CriteriaTypeRecognizer;
import by.tc.task01.dao.parse.ApplicationParser;
import by.tc.task01.dao.parse.helpaction.ParameterValueFounder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO {
    private static final String path = "D:\\JavaProjects\\traning\\JWD_Task01_OOP\\jwd-task01-template\\src\\main\\resources\\appliances_db.txt";

    @Override
    public <E> Appliance find(Criteria<E> criteria) {
        String criteriaType = CriteriaTypeRecognizer.findOutCriteriaType(criteria);
        BufferedReader bufferedReader = null;
        Appliance appliance = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (!"".equals(line) && isFound(criteria, criteriaType, line)) {
                    List<String> parameters = ApplicationParser.getParameters(line, criteriaType);
                    appliance = ApplianceCreator.createApplianceBasedString(criteriaType, parameters);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
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
        Pattern pattern;
        Matcher matcher;
        for (Object key : allCriteria.keySet()) {
            pattern = Pattern.compile(key + "=" + allCriteria.get(key) + "[,;]");
            matcher = pattern.matcher(line);
            if (!matcher.find()) {
                return false;
            }
        }
        return true;
    }
}