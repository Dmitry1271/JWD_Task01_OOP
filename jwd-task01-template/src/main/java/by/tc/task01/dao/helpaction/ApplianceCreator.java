package by.tc.task01.dao.helpaction;

import by.tc.task01.entity.*;

import java.util.List;

/**
 * Created by cplus on 08.10.2017.
 */
public final class ApplianceCreator {

    public static Appliance createApplianceBasedString(String name, List<String> params) {
        if ("Laptop".equals(name)) {
            return new Laptop(Double.parseDouble(params.get(0)), params.get(1), Integer.parseInt(params.get(2)),
                    Integer.parseInt(params.get(3)), Double.parseDouble(params.get(4)), Integer.parseInt(params.get(5)));
        }
        if ("Oven".equals(name)) {
            return new Oven(Integer.parseInt(params.get(0)), Integer.parseInt(params.get(1)), Integer.parseInt(params.get(2)),
                    Double.parseDouble(params.get(3)), Double.parseDouble(params.get(4)), Double.parseDouble(params.get(5)));
        }
        if ("Refrigerator".equals(name)) {
            return new Refrigerator(Integer.parseInt(params.get(0)), Integer.parseInt(params.get(1)), Double.parseDouble(params.get(2)),
                    Double.parseDouble(params.get(3)), Double.parseDouble(params.get(4)), Double.parseDouble(params.get(5)));
        }
        if ("Speakers".equals(name)) {
            return new Speakers(Integer.parseInt(params.get(0)), Integer.parseInt(params.get(1)), params.get(2),
                    Integer.parseInt(params.get(3)));
        }
        if ("TabletPC".equals(name)) {
            return new TabletPC(Double.parseDouble(params.get(0)), Integer.parseInt(params.get(1)), Integer.parseInt(params.get(2)),
                    Integer.parseInt(params.get(3)), params.get(4));
        }
        if ("VacuumCleaner".equals(name)) {
            return new VacuumCleaner(Integer.parseInt(params.get(0)), params.get(1), params.get(2),
                    params.get(3), Integer.parseInt(params.get(4)), Integer.parseInt(params.get(5)));
        }
        return null;
    }

    private ApplianceCreator() {
    }
}
