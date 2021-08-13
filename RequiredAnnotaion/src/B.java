import org.springframework.beans.factory.annotation.Required;

public class B {
	private int a;
	
	private int b;
	
	public int getB() {
		return b;
	}
	@Required// only applicable for method not for property
	public void setB(int b) {
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}

	 @Override
	 public String toString() {
	 	return b+" I am from b toString:"+a;
	 }
}
