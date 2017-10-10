package by.tc.task01.service.validation.datavalidators.impl;

import by.tc.task01.service.validation.datavalidators.DataValidator;

/**
 * Created by cplus on 10.10.2017.
 */
public class DoubleValidator implements DataValidator {
    @Override
    public boolean isValidData(Object value) {
        try {
            if (value instanceof Number) {
                return ((Number) value).doubleValue() > 0;
            } else {
                try {
                    return Double.parseDouble((String) value) > 0;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
        } catch (ClassCastException e) {
            return false;
        }
    }
}
