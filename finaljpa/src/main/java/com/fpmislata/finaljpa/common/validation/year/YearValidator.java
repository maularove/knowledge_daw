package com.fpmislata.finaljpa.common.validation.year;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class YearValidator implements ConstraintValidator<ValidYear, Integer> {

    @Override
    public void initialize(ValidYear constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return (value == null || (value >= 1850 && value <= 9999));
    }
}
