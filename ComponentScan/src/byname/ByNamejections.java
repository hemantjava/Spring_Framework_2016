package byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ByNamejections {
	/* @Component -> then no need to bean configuration in xml file\
	 * @Service
	 * @Autowired
	 * @Qualifier
	 * @Controller
	 * byusing:<context:component-scan base-package="byname"/>
	 * */
public static void main(String[] args) {
ApplicationContext ap=new ClassPathXmlApplicationContext("byname/context.xml");
Book b=(Book)ap.getBean("book");
Author a=b.getAuthor();
a.setAddress("chirmiri");
a.setName("shilpa");
b.setIsbn(1234);
b.setYear("1232");
System.out.println(b);
}

}
