import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
	DemoDean db=(DemoDean)ctx.getBean("db1");
	db.show();
	
}
}
