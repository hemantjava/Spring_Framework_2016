import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class C {
	public C() {
		System.out.println("C Defaoult..");
	}
    //<context:annotation-config/> is mandatory in xml file
	@PostConstruct//called life cycle init method
	public void init1() {
		System.out.println("init1 method of C");
	}

	@PreDestroy//called life cycle destroyed method
	public void destroyed() {
		System.out.println("destroyed method of C");
	}
}
