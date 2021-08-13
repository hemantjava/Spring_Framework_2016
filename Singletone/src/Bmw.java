
public class Bmw implements Car {
	private Bmw() {
		System.out.println("Bmw constructor");
	}

	@Override
	public void drive() {
		System.out.println("Bmw drive");
	}

}
