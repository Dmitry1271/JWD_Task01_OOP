package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.validation.helpaction.CriteriaValidator;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.Oven;

/**
 * Created by cplus on 07.10.2017.
 */
public final class OvenValidator {
    public static <E> boolean isValidOven(Criteria<E> criteria) {
        Map<E, Object> allCriteria = criteria.getAllCriteria();

        for (Object key : allCriteria.keySet()) {
            if (key.equals(Oven.CAPACITY) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Oven.POWER_CONSUMPTION) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Oven.WEIGHT) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Oven.DEPTH) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Oven.HEIGHT) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Oven.WIDTH) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
        }
        return true;
    }

    private OvenValidator() {
    }
}
