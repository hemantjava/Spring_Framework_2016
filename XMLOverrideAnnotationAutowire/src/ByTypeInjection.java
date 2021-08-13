import org.springframework.context.ApplicationContext;
//override constructor injection by setter injection
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ByTypeInjection {
public static void main(String[] args) {
ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
Injection si=(Injection)ap.getBean("id");
si.show();

	}

}
