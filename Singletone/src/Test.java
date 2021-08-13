
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");
	   Car c=(Car)ctx.getBean("c");
	   System.out.println(c);

	}

}
