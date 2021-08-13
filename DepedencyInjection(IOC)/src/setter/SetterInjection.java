package setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("setter.xml");
		TravelServoce ts=(TravelServoce)ctx.getBean("s");
		ts.driveBy();
		

	}

}
