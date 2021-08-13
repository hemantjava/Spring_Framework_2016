package constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ByConstructorjections {
	/*//dependency-check="" work only old xsd like 2.5.xsd 
*/public static void main(String[] args) {
ApplicationContext ap=new ClassPathXmlApplicationContext("constructor/context.xml");
Book b=(Book)ap.getBean("b");
System.out.println(b);
}

}
