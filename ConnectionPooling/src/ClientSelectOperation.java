import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDAOImpl;


public class ClientSelectOperation {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bonecp.xml");
		
	     
	       
	       for (int i = 0; i <10000; i++) {
	       dao.StudentDAOImpl st=(StudentDAOImpl)ctx.getBean("st");
	       System.out.println("====================");
	       st.listEmp(); System.out.println(st.hashCode()+":"+i);
	       System.out.println("====================");  
	       }
	       
	}

}
