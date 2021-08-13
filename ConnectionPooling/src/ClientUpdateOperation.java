import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDAO;
import dto.Student;


public class ClientUpdateOperation {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		
	       StudentDAO st=(StudentDAO)ctx.getBean("st");
	      
	       System.out.println("====================");
	       Student s=new Student();
	       s.setName("hemant");
	       s.setSid(6182);
	       st.updateRecord(s);
	       System.out.println("====================");  
	}

}
