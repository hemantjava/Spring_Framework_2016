 import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		/*ambiguity problem prevent by using autowire-candidate="false" and Autowired(value="false")*/
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");
		A a=(A)ctx.getBean("a");
		System.out.println(a);
	}

}
