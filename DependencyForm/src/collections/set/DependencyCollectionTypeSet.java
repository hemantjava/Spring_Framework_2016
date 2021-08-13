package collections.set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyCollectionTypeSet {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("collections/set/collection.xml");
		CollectionSet col=(CollectionSet)ctx.getBean("set");
	    System.out.println(col.getTheSet());
	
		

	}

}
