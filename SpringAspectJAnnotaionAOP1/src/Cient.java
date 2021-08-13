import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.sonu.spring.aop.model.Product;

public class Cient {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		Product b = (Product) ctx.getBean("pi");
		
		b.add(12,10);
		System.out.println(b.multiply(12,5));

	}

}
