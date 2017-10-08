package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.validation.helpaction.CriteriaValidator;

import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC;

import java.util.Map;

/**
 * Created by cplus on 07.10.2017.
 */
public final class TabletPCValidator {
    public static <E> boolean isValidTabletPC(Criteria<E> criteria) {
        Map<E, Object> allCriteria = criteria.getAllCriteria();

        for (Object key : allCriteria.keySet()) {
            if (key.equals(TabletPC.DISPLAY_INCHES) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(TabletPC.MEMORY_ROM) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(TabletPC.FLASH_MEMORY_CAPACITY) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(TabletPC.BATTERY_CAPACITY) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(TabletPC.COLOR) && !CriteriaValidator.isValidString(allCriteria.get(key))) {
                return false;
            }
        }
        return true;
    }

    private TabletPCValidator() {
    }
}
