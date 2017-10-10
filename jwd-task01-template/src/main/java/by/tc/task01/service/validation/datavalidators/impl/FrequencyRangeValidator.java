package by.tc.task01.service.validation.datavalidators.impl;

import by.tc.task01.service.validation.datavalidators.DataValidator;

/**
 * Created by cplus on 10.10.2017.
 */
public class FrequencyRangeValidator implements DataValidator {
    @Override
    public boolean isValidData(Object value) {
        String regex = "^[0-9]{1,2}(\\.[0-9]{1,5})?-[0-9]{1,2}(\\.[0-9]{1,5})?$";
        try {
            if (value != null && !"".equals(value) && ((String) value).matches(regex)) {
                String[] values = ((String) value).split("-");
                return Double.parseDouble(values[0]) < Double.parseDouble(values[1]);
            } else {
                return false;
            }
        } catch (ClassCastException e) {
            return false;
        }
    }
}
