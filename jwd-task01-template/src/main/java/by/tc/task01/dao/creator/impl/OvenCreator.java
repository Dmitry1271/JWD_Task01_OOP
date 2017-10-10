package by.tc.task01.dao.creator.impl;

import by.tc.task01.dao.creator.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

import java.util.List;

/**
 * Created by cplus on 09.10.2017.
 */
public class OvenCreator implements Command {
    @Override
    public Appliance execute(List<String> params) {
        Oven oven = new Oven();
        oven.setPowerConsumption(Integer.parseInt(params.get(0)));
        oven.setWeight(Integer.parseInt(params.get(1)));
        oven.setCapacity(Integer.parseInt(params.get(2)));
        oven.setDepth(Double.parseDouble(params.get(3)));
        oven.setHeight(Double.parseDouble(params.get(4)));
        oven.setWidth(Double.parseDouble(params.get(5)));
        return oven;
    }
}
