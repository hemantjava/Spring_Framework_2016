import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//spring listener are used in stand alone application

public class Client {
public static void main(String[] args) {
	ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		
      ctx.start();
      ctx.stop();
      ctx.close();
      ctx.refresh();//restart event
}
}
