package com.sonu.spring.aop.model;

public class Account implements Bank{

	@Override
	public void withdrow() {
		System.out.println("i am withdrow");
		
	}

	@Override
	public void diposite() {
		System.out.println("i am diposite");
		
	}

	@Override
	public void invalid() {
		new ArithmeticException("arithmetic exception");
		}

}
