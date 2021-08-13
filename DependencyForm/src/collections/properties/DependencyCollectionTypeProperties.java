package collections.properties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyCollectionTypeProperties {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("collections/properties/collection.xml");
		CollectionProperties col=(CollectionProperties)ctx.getBean("prop");
	    System.out.println(col.getTheProp());
	
		

	}

}
