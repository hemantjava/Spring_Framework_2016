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

}
