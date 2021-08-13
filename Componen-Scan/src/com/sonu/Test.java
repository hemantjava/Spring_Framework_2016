package com.sonu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("resoures/context.xml");
	
	 /*Book b=(Book) ctx.getBean("book");*///valid
	   Book b=(Book) ctx.getBean(Book.class);
	 System.out.println(b);
}
}
