import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ReadByUsingBean {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");
		DataPojo d= (DataPojo)ctx.getBean("list");
		System.out.println(d.getList());

	}

}
