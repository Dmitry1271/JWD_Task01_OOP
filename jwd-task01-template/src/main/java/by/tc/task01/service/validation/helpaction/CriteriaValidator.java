package by.tc.task01.service.validation.helpaction;

/**
 * Created by cplus on 07.10.2017.
 */
public final class CriteriaValidator {

    public static boolean isValidNumber(Object criteria) {
        try {
            if (criteria instanceof Number) {
                return ((Number) criteria).doubleValue() > 0;
            } else {
                try {
                    return Double.parseDouble((String) criteria) > 0;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
        } catch (ClassCastException e) {
            return false;
        }
    }

    public static boolean isValidString(Object object) {
        try {
            return object != null && !"".equals((String) object);
        } catch (ClassCastException e) {
            return object instanceof StringBuilder || object instanceof StringBuffer || object instanceof Character;
        }
    }

    private CriteriaValidator() {
    }
}
