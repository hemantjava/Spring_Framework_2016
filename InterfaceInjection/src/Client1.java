import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client1 {
	public static void main(String[] args) {
		/*ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		DemoBean1 d1=(DemoBean1)ctx.getBean("db1");
		d1.show();*/
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		DemoBean2 d2=(DemoBean2)ctx.getBean("db2");
		d2.show();
	}

}
