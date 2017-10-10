package by.tc.task01.dao.creator.impl;

import by.tc.task01.dao.creator.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

import java.util.List;

/**
 * Created by cplus on 09.10.2017.
 */
public class VacuumCleanerCreator implements Command {
    @Override
    public Appliance execute(List<String> params) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.setPowerConsumption(Integer.parseInt(params.get(0)));
        vacuumCleaner.setFilterType(params.get(1));
        vacuumCleaner.setBagType(params.get(2));
        vacuumCleaner.setWandType(params.get(3));
        vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(params.get(4)));
        vacuumCleaner.setCleaningWidth(Integer.parseInt(params.get(5)));
        return vacuumCleaner;
    }
}
