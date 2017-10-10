package by.tc.task01.service.validation.datavalidators.impl;

import by.tc.task01.service.validation.datavalidators.DataValidator;

/**
 * Created by cplus on 10.10.2017.
 */
public class IntegerValidator implements DataValidator {
    @Override
    public boolean isValidData(Object value) {
        try {
            if (value instanceof Integer) {
                return (Integer) value > 0;
            } else {
                try {
                    return Integer.parseInt(((String) value).trim()) > 0;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
        } catch (ClassCastException e) {
            return false;
        }
    }
}
