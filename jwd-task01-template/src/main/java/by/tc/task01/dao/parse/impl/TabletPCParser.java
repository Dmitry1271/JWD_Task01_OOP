package by.tc.task01.dao.parse.impl;

import by.tc.task01.dao.helpaction.ParameterValueFounder;
import by.tc.task01.dao.parse.ParserCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cplus on 09.10.2017.
 */
public class TabletPCParser implements ParserCommand {
    @Override
    public List<String> execute(String line) {
        List<String> parameters = new ArrayList<>();
        parameters.add(ParameterValueFounder.findValue(line, "BATTERY_CAPACITY"));
        parameters.add(ParameterValueFounder.findValue(line, "DISPLAY_INCHES"));
        parameters.add(ParameterValueFounder.findValue(line, "MEMORY_ROM"));
        parameters.add(ParameterValueFounder.findValue(line, "FLASH_MEMORY_CAPACITY"));
        parameters.add(ParameterValueFounder.findValue(line, "COLOR"));
        return parameters;
    }
}
