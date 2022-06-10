package com.experiment.firstapp;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NameValidator.class)
public @interface Unique {
    String message();
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
