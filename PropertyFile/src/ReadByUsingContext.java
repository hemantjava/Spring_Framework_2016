import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ReadByUsingContext {
	/*
Reading properties file we have 2 approaches by using PropertyPlaceholderConfigurer bean class configuring
and by using  <context:property-placeholder location="details.properties"/>  tag or elements*/
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext.xml");
		DataPojo d= (DataPojo)ctx.getBean("list");
		System.out.println(d.getList());

	}

}
