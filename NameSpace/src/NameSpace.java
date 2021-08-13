import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NameSpace {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("context.xml");
		Book b = (Book) ap.getBean("msg");
		System.out.println(b);
	
//Note:- c name space is work in 3.1.xsd
	}

}
