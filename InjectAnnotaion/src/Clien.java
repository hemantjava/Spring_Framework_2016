import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Clien {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("solution.xml");
		Author au=(Author)ctx.getBean("id2");
		System.out.println(au.getName()+" "+au.getBook().getName());
	}

}
