package setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ClientProgram {
	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("setter/setter.xml");
	DemoBean db=(DemoBean)ac.getBean("b");
	SimpleDemo sd=db.getSd();
	
db.setSid(1234);
db.setSname("hemant");
sd.setAddrs("chirmiri");

System.out.println(db.getSid()+" "+db.getSname()+" "+sd.getAddrs());
System.out.println("---------------------------------");
Sonu so=(Sonu)ac.getBean("sos");
System.out.println(so.getName());

	}

}
