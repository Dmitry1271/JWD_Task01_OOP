package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.validation.helpaction.CriteriaValidator;

import static by.tc.task01.entity.criteria.SearchCriteria.Speakers;

import java.util.Map;

/**
 * Created by cplus on 07.10.2017.
 */
public final class SpeakersValidator {
    public static <E> boolean isValidSpeakers(Criteria<E> criteria) {
        Map<E, Object> allCriteria = criteria.getAllCriteria();

        for (Object key : allCriteria.keySet()) {
            if (key.equals(Speakers.CORD_LENGTH) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Speakers.NUMBER_OF_SPEAKERS) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Speakers.POWER_CONSUMPTION) && !CriteriaValidator.isValidNumber(allCriteria.get(key))) {
                return false;
            }
            if (key.equals(Speakers.FREQUENCY_RANGE) && !isValidFrequencyRange(allCriteria.get(key))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidFrequencyRange(Object object) {
        String regex = "^[0-9]{1,2}(\\.[0-9]{1,5})?-[0-9]{1,2}(\\.[0-9]{1,5})?$";
        try {
            if (object != null && !"".equals(object) && ((String) object).matches(regex)) {
                String[] values = ((String) object).split("-");
                return Double.parseDouble(values[0]) < Double.parseDouble(values[1]);
            } else {
                return false;
            }
        } catch (ClassCastException e) {
            return false;
        }
    }

    private SpeakersValidator() {
    }
}
