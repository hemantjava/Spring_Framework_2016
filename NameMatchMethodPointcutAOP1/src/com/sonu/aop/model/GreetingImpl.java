package com.sonu.aop.model;

public class GreetingImpl implements Greetings {

	@Override
	public void sayHelo() {
		System.out.println("hello...");

	}

	@Override
	public void sayBye() {
		long l=System.currentTimeMillis();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		long m=System.currentTimeMillis();
		System.out.println("bye.....:"+(m-l));

	}

	@Override
	public void welcome() {
		System.out.println("welcome to springframework");
	}

	@Override
	public String getMessage() {
		
		return "i am from getMessage helo";
	}

}
