package index;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SimpleContructor {
	public static void main(String[] args){
	ApplicationContext context=new ClassPathXmlApplicationContext("index/beans.xml");	
	// org.springframework.beans.factory.BeanCreationException:
	DemoBean d=(DemoBean)context.getBean("id");
	  d.getMsg();
		
	}

}
