package secondaproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("secondaproach/applicationContext.xml");
		DemoBean bd=(DemoBean)ctx.getBean("demo");
		System.out.println(bd);
		
			
	}

}
