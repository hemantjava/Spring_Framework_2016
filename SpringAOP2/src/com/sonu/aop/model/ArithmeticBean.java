package com.sonu.aop.model;

public class ArithmeticBean implements Arithmetic {

	@Override
	public void division(int a, int b) {
		System.out.println("division:"+(a/b));
	}

	@Override
	public int multiply(int a, int b) {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		return a*b;
	
	}

}
