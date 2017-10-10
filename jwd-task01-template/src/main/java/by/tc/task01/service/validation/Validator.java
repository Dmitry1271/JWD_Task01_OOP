package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.validation.datavalidators.ValidatorDirector;

import java.util.Map;


public class Validator {

    public static <E> boolean criteriaValidator(Criteria<E> criteria) {
        Map<E, Object> allCriteria = criteria.getAllCriteria();

        if (criteria == null || !allCriteria.keySet().iterator().hasNext()) {
            return false;
        }

        for (Object key : allCriteria.keySet()) {
            if (!new ValidatorDirector().getParameterValidators(key.toString()).isValidData(allCriteria.get(key))) {
                return false;
            }
        }
        return true;
    }
}