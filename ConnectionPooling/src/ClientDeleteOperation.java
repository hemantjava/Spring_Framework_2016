import javax.activation.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import dao.StudentDAO;
import dto.Student;


public class ClientDeleteOperation {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		
	       StudentDAO st=(StudentDAO)ctx.getBean("st");
	      
	       System.out.println("====================");
	       Student s=new Student();
	      
	       st.deleteRedcord(111);
	       System.out.println("====================");  
	}

}
