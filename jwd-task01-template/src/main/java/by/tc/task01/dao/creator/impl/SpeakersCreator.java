package by.tc.task01.dao.creator.impl;

import by.tc.task01.dao.creator.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

import java.util.List;

/**
 * Created by cplus on 09.10.2017.
 */
public class SpeakersCreator implements Command {
    @Override
    public Appliance execute(List<String> params) {
        Speakers speakers = new Speakers();
        speakers.setPowerConsumption(Integer.parseInt(params.get(0)));
        speakers.setNumberSpeakers(Integer.parseInt(params.get(1)));
        speakers.setFrequencyRange(params.get(2));
        speakers.setCordLength(Integer.parseInt(params.get(3)));
        return speakers;
    }
}
