import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class A {

	private B b;
	private B e;

	public B getE() {
		return e;
	}
	public void setE(B e) {
		this.e = e;
	}

	public B getB() {
		return b;
	}
	@Autowired
	@Qualifier(value = "e")
	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "I am from A toString" + b;
	}
}
