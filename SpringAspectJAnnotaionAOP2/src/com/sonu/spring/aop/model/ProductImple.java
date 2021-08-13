package com.sonu.spring.aop.model;

public class ProductImple implements Product {

	@Override
	public void add(int a, int b) {
		System.out.println("sum:"+(a+b));

	}

	@Override
	public int multiply(int a, int b) {
		return (a*b);
	}

	@Override
	public void sub(int a, int b) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sub:"+(a-b));
		
	}

}
