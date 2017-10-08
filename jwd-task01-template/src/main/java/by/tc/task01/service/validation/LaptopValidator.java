package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.validation.helpaction.CriteriaValidator;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.Laptop;

/**
 * Created by cplus on 06.10.2017.
 */
public final class LaptopValidator {
    public static <E> boolean isValidLaptop(Criteria<E> criteria) {
        Map<E, Object> allCriteria = criteria.getAllCriteria();

        for (Object key : allCriteria.keySet()) {
            if (key.equals(Laptop.DISPLAY_INCHS) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Laptop.MEMORY_ROM) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Laptop.SYSTEM_MEMORY) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Laptop.BATTERY_CAPACITY) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Laptop.CPU) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Laptop.OS) && !CriteriaValidator.isValidString(allCriteria.get(key))) {
                return false;
            }
        }
        return true;
    }

    private LaptopValidator() {
    }
}
