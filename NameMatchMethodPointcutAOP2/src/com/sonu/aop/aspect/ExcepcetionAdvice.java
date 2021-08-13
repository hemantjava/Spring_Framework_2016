package com.sonu.aop.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ExcepcetionAdvice implements ThrowsAdvice {
	
	public void afterThrowing(Method m, Object a[],Object t,Exception e){
		System.out.println("i am thows advice for:"+m.getName());
		System.out.println("exeption is accured in business method:"+e.getMessage());
	}

}
