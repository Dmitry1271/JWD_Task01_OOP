package by.tc.task01.dao.parse.impl;

import by.tc.task01.dao.helpaction.ParameterValueFounder;
import by.tc.task01.dao.parse.ParserCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cplus on 09.10.2017.
 */
public class LaptopParametersParser implements ParserCommand {
    @Override
    public List<String> execute(String line) {
        List<String> parameters = new ArrayList<>();
        parameters.add(ParameterValueFounder.findValue(line, "BATTERY_CAPACITY"));
        parameters.add(ParameterValueFounder.findValue(line, "OS"));
        parameters.add(ParameterValueFounder.findValue(line, "MEMORY_ROM"));
        parameters.add(ParameterValueFounder.findValue(line, "SYSTEM_MEMORY"));
        parameters.add(ParameterValueFounder.findValue(line, "CPU"));
        parameters.add(ParameterValueFounder.findValue(line, "DISPLAY_INCHS"));
        return parameters;
    }
}
