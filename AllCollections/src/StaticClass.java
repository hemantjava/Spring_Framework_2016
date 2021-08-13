
public class StaticClass {
    static class Add{
    	static void m(){
    		System.out.println("Add class method");
    	}
    }
	public static void main(String[] args) {
		Add.m();

	}

}
