package by.tc.task01.service.validation.datavalidators;

import by.tc.task01.service.validation.datavalidators.impl.DoubleValidator;
import by.tc.task01.service.validation.datavalidators.impl.FrequencyRangeValidator;
import by.tc.task01.service.validation.datavalidators.impl.IntegerValidator;
import by.tc.task01.service.validation.datavalidators.impl.StringValidator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cplus on 10.10.2017.
 */
public class ValidatorDirector {
    private Map<String, DataValidator> parameterValidators = new HashMap<>();

    public ValidatorDirector() {
        parameterValidators.put("BATTERY_CAPACITY", new DoubleValidator());
        parameterValidators.put("OS", new StringValidator());
        parameterValidators.put("MEMORY_ROM", new IntegerValidator());
        parameterValidators.put("SYSTEM_MEMORY", new IntegerValidator());
        parameterValidators.put("CPU", new DoubleValidator());
        parameterValidators.put("DISPLAY_INCHES", new IntegerValidator());
        parameterValidators.put("DISPLAY_INCHS", new IntegerValidator());
        parameterValidators.put("POWER_CONSUMPTION", new IntegerValidator());
        parameterValidators.put("WEIGHT", new IntegerValidator());
        parameterValidators.put("CAPACITY", new IntegerValidator());
        parameterValidators.put("DEPTH", new DoubleValidator());
        parameterValidators.put("HEIGHT", new DoubleValidator());
        parameterValidators.put("WIDTH", new DoubleValidator());
        parameterValidators.put("FREEZER_CAPACITY", new DoubleValidator());
        parameterValidators.put("OVERALL_CAPACITY", new DoubleValidator());
        parameterValidators.put("NUMBER_OF_SPEAKERS", new IntegerValidator());
        parameterValidators.put("FREQUENCY_RANGE", new FrequencyRangeValidator());
        parameterValidators.put("CORD_LENGTH", new IntegerValidator());
        parameterValidators.put("FLASH_MEMORY_CAPACITY", new IntegerValidator());
        parameterValidators.put("COLOR", new StringValidator());
        parameterValidators.put("FILTER_TYPE", new StringValidator());
        parameterValidators.put("BAG_TYPE", new StringValidator());
        parameterValidators.put("WAND_TYPE", new StringValidator());
        parameterValidators.put("MOTOR_SPEED_REGULATION", new IntegerValidator());
        parameterValidators.put("CLEANING_WIDTH", new IntegerValidator());
    }

    public DataValidator getParameterValidators(String parameterName) {
        return parameterValidators.get(parameterName);
    }
}
