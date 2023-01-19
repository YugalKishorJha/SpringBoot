package com.example.crudpractice.controllerAdvice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

@RestControllerAdvice
public class ExceptionHandlerClass {

	@ExceptionHandler(ConstraintViolationException.class)
	@ResponseStatus(code = HttpStatus.OK)
	Map<String, String> handleException1(ConstraintViolationException e) {
		Map<String, String> mm = new HashMap<>();
		Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
		constraintViolations.forEach((x) -> mm.put(x.getMessageTemplate(), x.getMessage()));
		return mm;
	}

}
