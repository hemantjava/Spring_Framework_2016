package com.sonu.spring.aop.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ThrowingAdvice implements ThrowsAdvice {
	
	public void afterThrowing(Object arg0, Method arg1){
		
		System.out.println("exception occured at:"+arg1.getName());
		
	}

}
