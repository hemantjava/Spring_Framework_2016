import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ByInjections {
public static void main(String[] args) {
ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
ServiceClass si=(ServiceClass)ap.getBean("h3");
//if setter injection then default construct must be executed
//if construct injection then not
System.out.println(si.getMesg());

}

}
