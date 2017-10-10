package by.tc.task01.dao.creator;

import by.tc.task01.dao.creator.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cplus on 09.10.2017.
 */
public class ApplianceDirector {
    private Map<String, Command> appliancesCreators = new HashMap<>();

    public ApplianceDirector() {
        appliancesCreators.put("Laptop", new LaptopCreator());
        appliancesCreators.put("Oven", new OvenCreator());
        appliancesCreators.put("Refrigerator", new RefrigeratorCreator());
        appliancesCreators.put("Speakers", new SpeakersCreator());
        appliancesCreators.put("TabletPC", new TabletPCCreator());
        appliancesCreators.put("VacuumCleaner", new VacuumCleanerCreator());
    }

    public Command getCommand(String typeName) {
        return appliancesCreators.get(typeName);
    }
}
