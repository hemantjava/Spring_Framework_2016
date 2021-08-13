package com.sonu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {
	@Autowired
	private Author au;
	public void setAu(Author au) {
		this.au = au;
	}
	private String name="core java";
	@Override
public String toString() {
	return name +" "+au;
}
}
