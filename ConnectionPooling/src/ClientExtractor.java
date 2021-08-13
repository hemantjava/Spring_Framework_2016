

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import dao.StudentDAO;
public class ClientExtractor {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("c3p0.xml");
	
       StudentDAO st=(StudentDAO)ctx.getBean("st");
      
       System.out.println("====================");
       st.selectResultSetExtractor();
       System.out.println("====================");  
	
	}

}
