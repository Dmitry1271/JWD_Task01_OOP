package by.tc.task01.dao.parse.impl;

import by.tc.task01.dao.helpaction.ParameterValueFounder;
import by.tc.task01.dao.parse.ParserCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cplus on 09.10.2017.
 */
public class RefrigeratorParser implements ParserCommand {
    @Override
    public List<String> execute(String line) {
        List<String> parameters = new ArrayList<>();
        parameters.add(ParameterValueFounder.findValue(line, "POWER_CONSUMPTION"));
        parameters.add(ParameterValueFounder.findValue(line, "WEIGHT"));
        parameters.add(ParameterValueFounder.findValue(line, "FREEZER_CAPACITY"));
        parameters.add(ParameterValueFounder.findValue(line, "OVERALL_CAPACITY"));
        parameters.add(ParameterValueFounder.findValue(line, "HEIGHT"));
        parameters.add(ParameterValueFounder.findValue(line, "WIDTH"));
        return parameters;
    }
}
