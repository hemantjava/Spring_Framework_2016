package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client2 {
public static void main(String[] args) {
	//pre-instantiating for singleton scope and not for prototype scope
	ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/beans.xml");
	System.out.println("sucessful loaded your xml document..");
}
}
