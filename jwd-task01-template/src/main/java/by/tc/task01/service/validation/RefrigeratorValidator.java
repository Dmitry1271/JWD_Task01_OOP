package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.validation.helpaction.CriteriaValidator;

import static by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;

import java.util.Map;

/**
 * Created by cplus on 07.10.2017.
 */
public final class RefrigeratorValidator {
    public static <E> boolean isValidRefrigerator(Criteria<E> criteria) {
        Map<E, Object> allCriteria = criteria.getAllCriteria();

        for (Object key : allCriteria.keySet()) {
            if (key.equals(Refrigerator.POWER_CONSUMPTION) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Refrigerator.WEIGHT) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Refrigerator.FREEZER_CAPACITY) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Refrigerator.OVERALL_CAPACITY) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Refrigerator.HEIGHT) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Refrigerator.WIDTH) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
        }
        return true;
    }

    private RefrigeratorValidator() {
    }
}
