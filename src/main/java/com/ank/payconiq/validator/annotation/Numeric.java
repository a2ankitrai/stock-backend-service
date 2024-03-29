package com.ank.payconiq.validator.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.ank.payconiq.validator.NumericValidator;

@Documented
@Retention(RUNTIME)
@Target({ FIELD, METHOD, PARAMETER })
@Constraint(validatedBy = { NumericValidator.class })
public @interface Numeric {

	String message() default "Entered value is not valid. Only Numeric value is allowed.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}