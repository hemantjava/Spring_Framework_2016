package com.sonu.aop.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TimerAountAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		String name=arg0.getMethod().getName();
		System.out.println("i am around advice for:"+name);
		long l=System.currentTimeMillis();
		Object o=arg0.proceed();
		long m=System.currentTimeMillis();
		System.out.println("time taken in business method:"+(m-l)+"ms");
		return o;
	}

}
