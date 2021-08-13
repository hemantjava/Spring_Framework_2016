
public class Audi implements Car {
	private Audi() {
		System.out.println("Audi constructor");
	}

	@Override
	public void drive() {
		System.out.println("audi drive");
	}

}
