import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientProg {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("solution.xml");
		/*ApplicationContext ctx=new ClassPathXmlApplicationContext("inner.xml");*/

		SampleBean sb=(SampleBean)ctx.getBean("id1");
		sb.show();
		ExampleBean sb1=(ExampleBean)ctx.getBean("id2");
		sb1.show();
		/*DemoBean b1=(DemoBean)ctx.getBean("b");
	    System.out.println(b1);*/

	}

}
