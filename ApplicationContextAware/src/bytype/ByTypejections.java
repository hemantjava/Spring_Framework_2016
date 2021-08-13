package bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ByTypejections {
public static void main(String[] args) {
ApplicationContext ap=new ClassPathXmlApplicationContext("bytype/context.xml");
/*ApplicationContext ap2=new ClassPathXmlApplicationContext("bytype/context.xml");
*/
//Book b=(Book)ap.getBean("b");
Book b=(Book)ap.getBean("b");
ApplicationContext ap1=b.getActx();
Author au=(Author)ap1.getBean("author");
System.out.println(ap.hashCode()+" "+ap1.hashCode());
System.out.println(b);
System.out.println(au);
}

}
