package parent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * <ref parent="id"> <ref> tag attribute is parent if dependency bean is configure in 
 * different XML(parent) file. 
 */
public class ClientProgram {
	public static void main(String[] args) {
		
	/*Resource r1=new ClassPathResource("parent/parent.xml");
	BeanFactory f1=new XmlBeanFactory(r1);

	Resource r2=new ClassPathResource("parent/chield.xml");
	BeanFactory f2=new XmlBeanFactory(r2,f1);*/
	ApplicationContext ac1=new ClassPathXmlApplicationContext("parent/parent.xml");
	String ss[]={"parent/chield.xml"};
	ApplicationContext ac2=new ClassPathXmlApplicationContext(ss,ac1);
	Service s=(Service)ac2.getBean("b");
    s.showServics();
	}

}
