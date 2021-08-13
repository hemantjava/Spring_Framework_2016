import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SolutionCircularContructor {
	public static void main(String[] args){
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");	
	DemoBean d=(DemoBean)context.getBean("id1");
	DemoBean1 d1=(DemoBean1)context.getBean("id2");
	  d.getMsg();
	  d1.getMsg();
		
	}

}
