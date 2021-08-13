import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;


public class DemoBean2 implements BeanFactoryAware {
	private String name;
	
public DemoBean2(String name) {
		this.name = name;
	}

	public void show()
	{
		System.out.println(name);
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println(arg0+" initialization...");
		
	}

}
