package by.tc.task01.dao.parse.helpaction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by cplus on 08.10.2017.
 */
public final class ParameterValueFounder {

    public static String findNumericalValue(String line, String parameterName) {
        Pattern pattern = Pattern.compile(parameterName + "=[0-9]+(\\.[0-9]+)?");
        Matcher matcher = pattern.matcher(line);
        matcher.find();
        return matcher.group().split("=")[1];
    }

    public static String findStringValue(String line, String parameterName) {
        Pattern pattern = Pattern.compile(parameterName + "=[0-9a-zA-Z\\.-]+");
        Matcher matcher = pattern.matcher(line);
        matcher.find();
        return matcher.group().split("=")[1];
    }

    private ParameterValueFounder() {
    }
}
