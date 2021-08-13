import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientAppCreateTable {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		DemoBean demo=(DemoBean)ctx.getBean("db");
		demo.create();
	}

}
