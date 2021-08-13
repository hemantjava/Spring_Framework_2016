
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDAO;
public class ClientRowMapper {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("dbcp.xml");
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("dbcp.xml");
       
       for (int i = 0; i < 10000 ; i++) {
    	   StudentDAO st=(StudentDAO)ctx.getBean("st");
           st.selectRowMapper();
           System.out.println(st.hashCode()+"============:"+i); 
		
	}
       
       //ctx.close();
       
	
	}

}
