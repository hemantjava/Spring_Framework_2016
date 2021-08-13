package autodetect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//deprecated spring 3.0
public class ByAutodetect {
public static void main(String[] args) {
ApplicationContext ap=new ClassPathXmlApplicationContext("autodetect/context.xml");
Book b=(Book)ap.getBean("b");
System.out.println(b);
}

}
