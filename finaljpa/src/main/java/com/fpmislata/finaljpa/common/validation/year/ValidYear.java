package com.fpmislata.finaljpa.common.validation.year;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

// se puede aplicar a métodos y campos
@Target({ ElementType.METHOD, ElementType.FIELD })

// estará disponible en tiempo de ejecución
@Retention(RetentionPolicy.RUNTIME)

// especifica que clase YearValidator
// es la que proporciona la lógica de validación para esta anotación
@Constraint(validatedBy = YearValidator.class)
public @interface ValidYear {
    String message() default "El año debe ser posterior a 1850";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
