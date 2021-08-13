package bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByTypejections {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext(
				"bytype/context.xml");
		Book b = (Book) ap.getBean("b");
		System.out.println(b);
		/*
		 * 1)if multiple type matched then throw exeption 2)if multiple type
		 * matched and only one propery name is matched thren sesster injection
		 * injected
		 */
	}

}
