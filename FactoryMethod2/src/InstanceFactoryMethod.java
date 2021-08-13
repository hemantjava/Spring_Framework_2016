import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceFactoryMethod {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext(
				"context.xml");
		DemoBean d = (DemoBean) ap.getBean("db");
		d.msg();
	

	}

}
