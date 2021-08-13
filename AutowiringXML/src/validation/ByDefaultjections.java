package validation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//dependency-check="" work only old xsd like 2.5.xsd 
public class ByDefaultjections {
public static void main(String[] args) {
ApplicationContext ap=new ClassPathXmlApplicationContext("validation/context.xml");
Book b=(Book)ap.getBean("b");
System.out.println(b);
}

}
