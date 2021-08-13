package collections.list;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyCollectionTypeList {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("collections/list/collection.xml");
		CollectionList col=(CollectionList)ctx.getBean("list");
	    System.out.println(col.getTheList());
	
		

	}

}
