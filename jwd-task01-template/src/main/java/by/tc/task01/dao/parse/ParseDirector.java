package by.tc.task01.dao.parse;

import by.tc.task01.dao.parse.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cplus on 09.10.2017.
 */
public class ParseDirector {
    private Map<String, ParserCommand> lineParsers = new HashMap<>();

    public ParseDirector() {
        lineParsers.put("Laptop", new LaptopParametersParser());
        lineParsers.put("Oven", new OvenParametersParser());
        lineParsers.put("Refrigerator", new RefrigeratorParser());
        lineParsers.put("Speakers", new SpeakersParser());
        lineParsers.put("TabletPC", new TabletPCParser());
        lineParsers.put("VacuumCleaner", new VacuumCleanerParser());
    }

    public ParserCommand getParserCommand(String typeName) {
        return lineParsers.get(typeName);
    }
}
