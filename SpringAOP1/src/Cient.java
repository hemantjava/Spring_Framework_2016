import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sonu.spring.aop.model.Bank;

public class Cient {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		Bank b = (Bank) ctx.getBean("pfb");
		// here we pass ProxyFactoryBean id
		b.diposite();
		b.withdrow();
	

	}

}
