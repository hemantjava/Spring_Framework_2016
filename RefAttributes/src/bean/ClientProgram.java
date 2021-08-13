package bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import parent.Service;
/*
 * <ref local="id"> <ref> tag attribute is bean if dependency bean is configure in 
 * same and parent XML files then acts like first local bean then parent bean. 
 */
public class ClientProgram {
	public static void main(String[] args) {
		ApplicationContext ac1=new ClassPathXmlApplicationContext("bean/parent.xml");
		String ss[]={"bean/chield.xml"};
		ApplicationContext ac2=new ClassPathXmlApplicationContext(ss,ac1);
		ReportGeneratorImpl s=(ReportGeneratorImpl)ac2.getBean("b");
	    s.showServics();
		

	}

}
