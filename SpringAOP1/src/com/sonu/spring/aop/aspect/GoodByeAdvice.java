package com.sonu.spring.aop.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class GoodByeAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("Good bye..:"+arg1.getName());

	}

}
