import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientProgram {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");
		Demo demo=(Demo)ctx.getBean("db");
		 demo.result();
	}

}
/*Remember points:-
 * 1)if auto wiring setter and explicit wiring is constructor or vice versa then "setter" injection is injected 
 * 2)if both auto wiring setter and explicit wiring is also setter then "explicit" wiring is injected
 * 3)if both auto wiring constructor and explicit wiring is also constructor then "explicit" wiring is injected
 * 
 * */
 