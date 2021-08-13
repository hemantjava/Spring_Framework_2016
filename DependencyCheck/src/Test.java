import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		/*order of bean object creation...up to down*/
		ApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");
		

	}

}
