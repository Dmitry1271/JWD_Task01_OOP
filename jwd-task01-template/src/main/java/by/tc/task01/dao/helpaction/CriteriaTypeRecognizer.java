package by.tc.task01.dao.helpaction;

import by.tc.task01.entity.criteria.Criteria;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

/**
 * Created by cplus on 08.10.2017.
 */
public final class CriteriaTypeRecognizer {

    public static <E> String findOutCriteriaType(Criteria<E> criteria) {
        Object criteriaType = criteria.getAllCriteria().keySet().iterator().next().getClass();
        if (criteriaType.equals(Laptop.class)) {
            return "Laptop";
        }
        if (criteriaType.equals(Oven.class)) {
            return "Oven";
        }
        if (criteriaType.equals(Refrigerator.class)) {
            return "Refrigerator";
        }
        if (criteriaType.equals(Speakers.class)) {
            return "Speakers";
        }
        if (criteriaType.equals(TabletPC.class)) {
            return "TabletPC";
        }
        if (criteriaType.equals(VacuumCleaner.class)) {
            return "VacuumCleaner";
        }
        return null;
    }

    private CriteriaTypeRecognizer() {
    }
}
