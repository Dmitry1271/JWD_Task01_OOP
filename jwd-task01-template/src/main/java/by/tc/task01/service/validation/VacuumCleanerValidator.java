package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.validation.helpaction.CriteriaValidator;

import static by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;

import java.util.Map;

/**
 * Created by cplus on 07.10.2017.
 */
public final class VacuumCleanerValidator {
    public static <E> boolean isValidVacuumCleaner(Criteria<E> criteria) {
        Map<E, Object> allCriteria = criteria.getAllCriteria();

        for (Object key : allCriteria.keySet()) {
            if (key.equals(VacuumCleaner.POWER_CONSUMPTION) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(VacuumCleaner.MOTOR_SPEED_REGULATION) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(VacuumCleaner.CLEANING_WIDTH) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(VacuumCleaner.FILTER_TYPE) && !CriteriaValidator.isValidString(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(VacuumCleaner.BAG_TYPE) && !CriteriaValidator.isValidString(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(VacuumCleaner.WAND_TYPE) && !CriteriaValidator.isValidString(allCriteria.get(key))) {
                return false;
            }
        }
        return true;
    }

    private VacuumCleanerValidator() {
    }
}
