package by.tc.task01.dao.creator.impl;

import by.tc.task01.dao.creator.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

import java.util.List;

/**
 * Created by cplus on 09.10.2017.
 */
public class RefrigeratorCreator implements Command {
    @Override
    public Appliance execute(List<String> params) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setPowerConsumption(Integer.parseInt(params.get(0)));
        refrigerator.setWeight(Integer.parseInt(params.get(1)));
        refrigerator.setFreezerCapacity(Double.parseDouble(params.get(2)));
        refrigerator.setOverallCapacity(Double.parseDouble(params.get(3)));
        refrigerator.setHeight(Double.parseDouble(params.get(4)));
        refrigerator.setWidth(Double.parseDouble(params.get(5)));
        return refrigerator;
    }
}
