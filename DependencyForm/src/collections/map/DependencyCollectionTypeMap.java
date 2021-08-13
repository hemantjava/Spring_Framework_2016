package collections.map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyCollectionTypeMap {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("collections/map/collection.xml");
		CollectionMap col=(CollectionMap)ctx.getBean("map");
	    System.out.println(col.getTheMap());
	
		

	}

}
