import org.springframework.beans.factory.FactoryBean;

public class TestBean implements FactoryBean<Book> {
	// to give instance of a class
	@Override
	public Book getObject() throws Exception {

		return new Book();
	}
    //to give class object (metadata)
	@Override
	public Class<Book> getObjectType() {

		return Book.class;
	}
    //to class is singletone or not
	@Override
	public boolean isSingleton() {

		return true;
	}

}
