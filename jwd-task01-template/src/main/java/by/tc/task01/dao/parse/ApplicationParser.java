package by.tc.task01.dao.parse;

import by.tc.task01.dao.parse.helpaction.ParameterValueFounder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cplus on 08.10.2017.
 */
public final class ApplicationParser {

    public static List<String> getParameters(String line, String criteriaType) {
        if ("Oven".equals(criteriaType)) {
            return getOvenParameters(line);
        }
        if ("Laptop".equals(criteriaType)) {
            return getLaptopParameters(line);
        }
        if ("Refrigerator".equals(criteriaType)) {
            return getRefrigeratorParameters(line);
        }
        if ("Speakers".equals(criteriaType)) {
            return getSpeakersParameters(line);
        }
        if ("TabletPC".equals(criteriaType)) {
            return getTabletPCParameters(line);
        }
        if ("VacuumCleaner".equals(criteriaType)) {
            return getVacuumCleanerParameters(line);
        }
        return null;
    }

    private static List<String> getOvenParameters(String line) {
        List<String> parameters = new ArrayList<>();
        parameters.add(ParameterValueFounder.findNumericalValue(line, "POWER_CONSUMPTION"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "WEIGHT"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "CAPACITY"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "DEPTH"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "HEIGHT"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "WIDTH"));
        return parameters;
    }

    private static List<String> getLaptopParameters(String line) {
        List<String> parameters = new ArrayList<>();
        parameters.add(ParameterValueFounder.findNumericalValue(line, "BATTERY_CAPACITY"));
        parameters.add(ParameterValueFounder.findStringValue(line, "OS"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "MEMORY_ROM"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "SYSTEM_MEMORY"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "CPU"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "DISPLAY_INCHS"));
        return parameters;
    }

    private static List<String> getRefrigeratorParameters(String line) {
        List<String> parameters = new ArrayList<>();
        parameters.add(ParameterValueFounder.findNumericalValue(line, "POWER_CONSUMPTION"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "WEIGHT"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "FREEZER_CAPACITY"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "OVERALL_CAPACITY"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "HEIGHT"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "WIDTH"));
        return parameters;
    }

    private static List<String> getSpeakersParameters(String line) {
        List<String> parameters = new ArrayList<>();
        parameters.add(ParameterValueFounder.findNumericalValue(line, "POWER_CONSUMPTION"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "NUMBER_OF_SPEAKERS"));
        parameters.add(ParameterValueFounder.findStringValue(line, "FREQUENCY_RANGE"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "CORD_LENGTH"));
        return parameters;
    }

    private static List<String> getTabletPCParameters(String line) {
        List<String> parameters = new ArrayList<>();
        parameters.add(ParameterValueFounder.findNumericalValue(line, "BATTERY_CAPACITY"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "DISPLAY_INCHES"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "MEMORY_ROM"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "FLASH_MEMORY_CAPACITY"));
        parameters.add(ParameterValueFounder.findStringValue(line, "COLOR"));
        return parameters;
    }

    private static List<String> getVacuumCleanerParameters(String line) {
        List<String> parameters = new ArrayList<>();
        parameters.add(ParameterValueFounder.findNumericalValue(line, "POWER_CONSUMPTION"));
        parameters.add(ParameterValueFounder.findStringValue(line, "FILTER_TYPE"));
        parameters.add(ParameterValueFounder.findStringValue(line, "BAG_TYPE"));
        parameters.add(ParameterValueFounder.findStringValue(line, "WAND_TYPE"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "MOTOR_SPEED_REGULATION"));
        parameters.add(ParameterValueFounder.findNumericalValue(line, "CLEANING_WIDTH"));
        return parameters;
    }

    private ApplicationParser() {
    }
}
