package default_no;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//default means autowire="no" thats mean manually write injection.. 
public class ByDefaultjections {
public static void main(String[] args) {
ApplicationContext ap=new ClassPathXmlApplicationContext("default_no/context.xml");
Book b=(Book)ap.getBean("b");
System.out.println(b);
}

}
