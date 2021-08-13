package com.javatpoint;
import java.util.Scanner;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;


public class Test {	
public static void main(String[] args) {
	
	Resource r=new ClassPathResource("applicationContext.xml");
	BeanFactory b=new XmlBeanFactory(r);
	MailMail m=(MailMail)b.getBean("mailMail");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter sender id:");
	String sender=sc.next();
	System.out.println("Enter receiver id:");
	String receiver=sc.next();
	System.out.println("enetr ur message:");
	String sms=sc.next();
	sc.close();
	
	m.sendMail(sender,receiver,"hi",sms);
	
	System.out.println("success");
}
}
