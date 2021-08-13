package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Clent {
public static void main(String[] args) {
	Resource res=new ClassPathResource("resources/beans.xml");
	//post-instantiating 
	BeanFactory fac=new XmlBeanFactory(res);
	//DemoBean d=(DemoBean)fac.getBean("db"); //user call by id
	//DemoBean d=(DemoBean)fac.getBean(DemoBean.class);
	System.out.println("sucessful loaded your xml document..");
}
}
