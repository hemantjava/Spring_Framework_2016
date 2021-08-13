import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
	public static void main(String[] args) {
		String[] str=new String[]{"car.xml","engine.xml"};
		ApplicationContext ctx=new ClassPathXmlApplicationContext(str);
		Car c=(Car)ctx.getBean("car");
		c.result();
	}

}
