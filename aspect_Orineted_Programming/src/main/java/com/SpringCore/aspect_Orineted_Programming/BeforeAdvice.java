package com.SpringCore.aspect_Orineted_Programming;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("I am before adivce method of " + method.getName());
	}

}
