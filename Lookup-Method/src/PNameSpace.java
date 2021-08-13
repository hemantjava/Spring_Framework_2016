import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PNameSpace {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext(
				"context.xml");
		Book b = (Book) ap.getBean("book");
		System.out.println(b.author().getName());

	}

}
