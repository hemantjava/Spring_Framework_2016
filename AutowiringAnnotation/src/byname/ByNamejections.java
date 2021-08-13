package byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByNamejections {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext(
				"byname/context.xml");
		Book b = (Book) ap.getBean("b");
		System.out.println(b);
	}

}
