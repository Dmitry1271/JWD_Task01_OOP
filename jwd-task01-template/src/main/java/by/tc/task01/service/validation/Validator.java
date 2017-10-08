package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

public class Validator {

    public static <E> boolean criteriaValidator(Criteria<E> criteria) {
        if (criteria == null || !criteria.getAllCriteria().keySet().iterator().hasNext()) {
            return false;
        }

        Object criteriaType = criteria.getAllCriteria().keySet().iterator().next().getClass();

        if (criteriaType.equals(TabletPC.class) && !TabletPCValidator.isValidTabletPC(criteria)) {
            return false;
        }
        if (criteriaType.equals(Oven.class) && !OvenValidator.isValidOven(criteria)) {
            return false;
        }
        if (criteriaType.equals(Laptop.class) && !LaptopValidator.isValidLaptop(criteria)) {
            return false;
        }
        if (criteriaType.equals(Refrigerator.class) && !RefrigeratorValidator.isValidRefrigerator(criteria)) {
            return false;
        }
        if (criteriaType.equals(VacuumCleaner.class) && !VacuumCleanerValidator.isValidVacuumCleaner(criteria)) {
            return false;
        }
        return !(criteriaType.equals(Speakers.class) && !SpeakersValidator.isValidSpeakers(criteria));
    }
}