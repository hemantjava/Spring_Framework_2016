package over;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CounstructorNoOptional {
	public static void main(String[] args){
	ApplicationContext context=new ClassPathXmlApplicationContext("over/applicationcontext.xml");	
	DemoBean d=(DemoBean)context.getBean("id1");
	System.out.println(d.getName()+":"+d.getRno());
		
	}

}
