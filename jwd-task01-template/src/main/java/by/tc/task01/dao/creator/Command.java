package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;

import java.util.List;

/**
 * Created by cplus on 09.10.2017.
 */
public interface Command {
    Appliance execute(List<String> params);
}
