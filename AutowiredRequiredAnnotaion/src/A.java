import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class A {

	private B b;
	private C c;

	@Autowired(required = false)//object prop is optional to configure in xml
	public void setC(C c) {
		this.c = c;
	}

	public B getB() {
		return b;
	}

	@Autowired(required=true)////object is mandatory to configure in xml
	//@Required    here no need this annotation 
	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return c + "I am from A toString" + b;
	}
}
