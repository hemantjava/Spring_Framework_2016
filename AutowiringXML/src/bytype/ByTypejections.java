package bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ByTypejections {
public static void main(String[] args) {
ApplicationContext ap=new ClassPathXmlApplicationContext("bytype/context.xml");
Book b=(Book)ap.getBean("b");
System.out.println(b);
}

}
