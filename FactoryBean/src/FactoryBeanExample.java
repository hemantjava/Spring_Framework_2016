import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//factory bean a bean that create another bean object

public class FactoryBeanExample {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext(
				"context.xml");
		Book book = (Book) ap.getBean("test");
		book.show();
		
		
	}

}
