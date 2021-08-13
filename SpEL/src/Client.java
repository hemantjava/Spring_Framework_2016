import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
	DemoDean db=(DemoDean)ctx.getBean("db1");
	System.out.println(db.getThread());
	DemoDean db1=(DemoDean)ctx.getBean("db2");
	System.out.println(db1.getThread());
	
}
}
