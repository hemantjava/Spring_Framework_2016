import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class PNameSpace {
public static void main(String[] args) {
ApplicationContext ap=new ClassPathXmlApplicationContext("context.xml");
Author b=(Author)ap.getBean("au");
System.out.println(b);
System.out.println(b.getThread());
Book b1=(Book)ap.getBean("book");
System.out.println(b1);


}

}
