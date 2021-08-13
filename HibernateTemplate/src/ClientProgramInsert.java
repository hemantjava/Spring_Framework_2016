import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sonu.spring.model.DemoBean;


public class ClientProgramInsert {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		DemoBean db=(DemoBean)ctx.getBean("db");
		db.insertStudent(34, "hemnt", 89);
	}

}
