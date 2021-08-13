import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestClient {
	public static void main(String[] args) {
		ConfigurableApplicationContext ct=new ClassPathXmlApplicationContext("context.xml");
		ct.close();
	}

}
