import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientAppInsert {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		DemoBean demo=(DemoBean)ctx.getBean("db");
		OnlineShop os=(OnlineShop)ctx.getBean("os");
		System.out.println(os);
		demo.insert(os);
	}

}
