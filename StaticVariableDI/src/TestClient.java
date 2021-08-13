import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestClient {
	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("context.xml");
		A a=(A)ct.getBean("a");
		a.result();
	}

}
