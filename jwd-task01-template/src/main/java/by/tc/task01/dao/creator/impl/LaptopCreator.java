package by.tc.task01.dao.creator.impl;

import by.tc.task01.dao.creator.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

import java.util.List;

/**
 * Created by cplus on 09.10.2017.
 */
public class LaptopCreator implements Command {
    @Override
    public Appliance execute(List<String> params) {
        Laptop laptop = new Laptop();
        laptop.setBatteryCapacity(Double.parseDouble(params.get(0)));
        laptop.setOs(params.get(1));
        laptop.setMemoryRom(Integer.parseInt(params.get(2)));
        laptop.setSystemMemory(Integer.parseInt(params.get(3)));
        laptop.setCpu(Double.parseDouble(params.get(4)));
        laptop.setDisplayInches(Integer.parseInt(params.get(5)));
        return laptop;
    }
}
