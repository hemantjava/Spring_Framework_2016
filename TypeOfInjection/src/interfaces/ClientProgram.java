package interfaces;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ClientProgram {
	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("interfaces/setter.xml");
	Service s=(Service)ac.getBean("b");
    s.showServics();
	

	}

}
