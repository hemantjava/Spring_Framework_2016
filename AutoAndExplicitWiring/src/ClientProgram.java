import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientProgram {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");
		Demo demo=(Demo)ctx.getBean("db");
		 demo.result();
	}

}
