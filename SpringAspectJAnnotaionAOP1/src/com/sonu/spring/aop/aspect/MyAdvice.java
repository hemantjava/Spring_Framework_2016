package com.sonu.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class MyAdvice {
	@Before("execution(* com.sonu.spring.aop.model.Product.add(..))")
	public void before(JoinPoint jp){
		String name = jp.getSignature().getName();
		Object[] ojb = jp.getArgs();
		System.out.println("i am before advice.."+name);
		System.out.println("method arguments are.."+ojb[0]+" and "+ojb[1]);
	}
	@AfterReturning(pointcut="execution(* com.sonu.spring.aop.model.Product.multiply(..))",returning="result")
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
	public Object around(ProceedingJoinPoint pjp){ return null;}

}
