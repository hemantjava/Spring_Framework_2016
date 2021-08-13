
public class B {
	private int a;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public B() {
		System.out.println("B()");
	}
	 @Override
	 public String toString() {
	 	return " I am from b toString:"+a;
	 }
}
