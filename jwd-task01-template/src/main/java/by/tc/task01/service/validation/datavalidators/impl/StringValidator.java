package by.tc.task01.service.validation.datavalidators.impl;


import by.tc.task01.service.validation.datavalidators.DataValidator;

/**
 * Created by cplus on 10.10.2017.
 */
public class StringValidator implements DataValidator {
    @Override
    public boolean isValidData(Object value) {
        try {
            return value != null && !"".equals((String) value);
        } catch (ClassCastException e) {
            return value instanceof StringBuilder || value instanceof StringBuffer || value instanceof Character;
        }
    }
}
