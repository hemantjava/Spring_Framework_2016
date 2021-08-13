import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sonu.aop.model.Arithmetic;


public class Client {

	public static void main(String[] args) {
       ApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");
       Arithmetic an=(Arithmetic)ctx.getBean("pfb");
       System.out.println("multiplication:"+an.multiply(12, 12));
       System.out.println("---------------------------");
       an.division(12,0);
	}

}
