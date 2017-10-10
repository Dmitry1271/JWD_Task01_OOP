package by.tc.task01.dao.parse.impl;

import by.tc.task01.dao.helpaction.ParameterValueFounder;
import by.tc.task01.dao.parse.ParserCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cplus on 09.10.2017.
 */
public class VacuumCleanerParser implements ParserCommand {
    @Override
    public List<String> execute(String line) {
        List<String> parameters = new ArrayList<>();
        parameters.add(ParameterValueFounder.findValue(line, "POWER_CONSUMPTION"));
        parameters.add(ParameterValueFounder.findValue(line, "FILTER_TYPE"));
        parameters.add(ParameterValueFounder.findValue(line, "BAG_TYPE"));
        parameters.add(ParameterValueFounder.findValue(line, "WAND_TYPE"));
        parameters.add(ParameterValueFounder.findValue(line, "MOTOR_SPEED_REGULATION"));
        parameters.add(ParameterValueFounder.findValue(line, "CLEANING_WIDTH"));
        return parameters;
    }
}
