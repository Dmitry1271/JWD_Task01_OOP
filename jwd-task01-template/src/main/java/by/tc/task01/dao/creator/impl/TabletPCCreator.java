package by.tc.task01.dao.creator.impl;

import by.tc.task01.dao.creator.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

import java.util.List;

/**
 * Created by cplus on 09.10.2017.
 */
public class TabletPCCreator implements Command {
    @Override
    public Appliance execute(List<String> params) {
        TabletPC tabletPC = new TabletPC();
        tabletPC.setBatteryCapacity(Double.parseDouble(params.get(0)));
        tabletPC.setDisplayInches(Integer.parseInt(params.get(1)));
        tabletPC.setMemoryRom(Integer.parseInt(params.get(2)));
        tabletPC.setFlashMemoryCapacity(Integer.parseInt(params.get(3)));
        tabletPC.setColor(params.get(4));
        return tabletPC;
    }
}
