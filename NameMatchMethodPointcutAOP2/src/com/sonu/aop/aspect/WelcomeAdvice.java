package com.sonu.aop.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class WelcomeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		
            String name=arg0.getName();
            System.out.println("advice class:"+this.getClass().getName()+ "  welcome to :"+name);
	}
   
}
