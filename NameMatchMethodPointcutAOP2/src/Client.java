
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sonu.aop.model.Greetings;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		Greetings an = (Greetings) ctx.getBean("pfb");
		System.out.println(an.getMessage());
		System.out.println("========================================");
		
		an.sayBye();
		System.out.println("========================================");
		
		an.sayHelo();
		System.out.println("========================================");
		
		an.welcome();
		System.out.println("========================================");
		
	
	}

}
