
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//all collection support by spf list,set,map,Properties,array
public class ByInjections {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("context.xml");
		AllCollection b = (AllCollection) ap.getBean("b");
	    System.out.println(b.getList());
	    System.out.println(b.getSet());
	    System.out.println(b.getMap());
	    System.out.println(b);
	    System.out.println("=======================");
	    AllCollection1 c = (AllCollection1) ap.getBean("c");
	    System.out.println(c.getList());
	    System.out.println(c.getSet());
	    System.out.println(c.getMap());
	    System.out.println(c);
	   
		}

}
