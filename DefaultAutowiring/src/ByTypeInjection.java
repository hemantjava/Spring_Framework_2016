import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ByTypeInjection {
public static void main(String[] args) {
	/*<beans default-autowire="byName"/>*/
ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
Injection si=(Injection)ap.getBean("id");
Student s=si.getStr();
s.setRno(1234556);
s.setSname("hemant");
si.show();
	}

}
