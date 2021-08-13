package simple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencySimpleType {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("simple.xml");
	    Simple simple=(Simple)ctx.getBean("simple");
	    System.out.println(simple);
	
		

	}

}
