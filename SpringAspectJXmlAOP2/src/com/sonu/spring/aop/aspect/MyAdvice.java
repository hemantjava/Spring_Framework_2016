package com.sonu.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	public void before(JoinPoint jp){
		String name = jp.getSignature().getName();
		Object[] ojb = jp.getArgs();
		System.out.println("i am before advice.."+name);
		System.out.println("method arguments are.."+ojb[0]+" and "+ojb[1]);
	}
	public void afterReturning(JoinPoint jp,Object result){
		String name = jp.getSignature().getName();
		Object[] ojb = jp.getArgs();
		//result=jp.getTarget();
		System.out.println("i am afterReturning advice.."+name);
		System.out.println("method arguments are.."+ojb[0]+" and "+ojb[1]);
		System.out.println("this method result is..:"+result);
	}
	public void after(JoinPoint jp){}
	public void afterThrowing(JoinPoint jp,Throwable t){}
	public Object around(ProceedingJoinPoint pjp) throws Throwable{ 
		
		String name = pjp.getSignature().getName();
		Object[] ojb = pjp.getArgs();
		long l=System.currentTimeMillis();
		Object o=pjp.proceed();
		long m=System.currentTimeMillis();
		System.out.println("i am around advice.."+name);
		System.out.println("method arguments are.."+ojb[0]+" and "+ojb[1]);
		System.out.println("total time taken by process:"+(m-l));
		return o;
	}

}
