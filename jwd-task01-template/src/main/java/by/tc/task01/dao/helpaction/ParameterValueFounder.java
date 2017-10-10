package by.tc.task01.dao.helpaction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by cplus on 08.10.2017.
 */
public final class ParameterValueFounder {

    public static String findValue(String line, String parameterName) {
        Pattern pattern = Pattern.compile(parameterName + "=[0-9a-zA-Z\\.-]+");
        Matcher matcher = pattern.matcher(line);
        matcher.find();
        return matcher.group().split("=")[1];
    }

    private ParameterValueFounder() {
    }
}
