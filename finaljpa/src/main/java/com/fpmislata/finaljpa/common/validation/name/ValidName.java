package com.fpmislata.finaljpa.common.validation.name;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ ElementType.METHOD, ElementType.FIELD })

// estará disponible en tiempo de ejecución
@Retention(RetentionPolicy.RUNTIME)

// especifica que clase YearValidator
// es la que proporciona la lógica de validación para esta anotación
@Constraint(validatedBy = NameValidator.class)
public @interface ValidName {
    String message() default "El nombre no puede estar vacio";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
