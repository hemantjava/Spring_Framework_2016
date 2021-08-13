import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ReadByUsingUtil {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("utilContext.xml");
		Pojo d= (Pojo)ctx.getBean("list");
		System.out.println(d.getProp());

	}

}
