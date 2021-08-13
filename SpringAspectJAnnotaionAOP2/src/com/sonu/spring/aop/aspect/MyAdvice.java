package com.sonu.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
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
	/*//around advice applicable for method those are belongs to (package and class) com.sonu.spring.aop.model.Product 
	@Around("execution(* com.sonu.spring.aop.model.Product.*(..))")*/
	//around advice applicable for method those are belongs to (package and any class or interfaces) com.sonu.spring.aop.model 
	@Around("execution(* com.sonu.spring.aop.model.*.*(..))")
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
