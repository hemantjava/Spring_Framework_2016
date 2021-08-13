import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext xt=new ClassPathXmlApplicationContext("application.xml");
		Demo d=(Demo)xt.getBean("d");
		d.show();

	}
}
