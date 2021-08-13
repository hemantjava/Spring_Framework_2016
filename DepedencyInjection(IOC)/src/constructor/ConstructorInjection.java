package constructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("constructor.xml");
		TravelServoce ts=(TravelServoce)ctx.getBean("s");
		ts.driveBy();
		

	}

}
