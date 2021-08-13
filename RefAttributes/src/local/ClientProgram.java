package local;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * <ref local="id"> <ref> tag attribute is local if dependency bean is configure in 
 * same XML file. 
 */
public class ClientProgram {
	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("local/applicationcontext.xml");
	Service s=(Service)ac.getBean("b");
    s.showServics();
	

	}

}
