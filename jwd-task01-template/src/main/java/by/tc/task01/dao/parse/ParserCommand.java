package by.tc.task01.dao.parse;

import java.util.List;

/**
 * Created by cplus on 09.10.2017.
 */
public interface ParserCommand {
    List<String> execute(String line);
}
