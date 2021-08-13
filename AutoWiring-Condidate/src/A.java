
public class A {
	private B b;
	
	public void setB(B b) {
		this.b = b;
		System.out.println("setter");
	}
	public A(B b) {
		System.out.println("constructor");
		this.b = b;
	}
	public B getB() {
		return b;
	}
	public A() {
		System.out.println("A() default");
	}
 @Override
public String toString() {
	return "I am from A toString"+b;
}
}
