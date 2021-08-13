import org.springframework.beans.factory.BeanNameAware;


public class DemoBean1 implements BeanNameAware {
	private String name;
	
public DemoBean1(String name) {
		this.name = name;
	}

//setter injection
	@Override
	public void setBeanName(String name) {//return id name
		System.out.println(name+": is initialized");
		

	}
	
	public void show()
	{
		System.out.println(name);
	}

}
