public class Demo {
	private Demo demo;

	private Demo() {
		System.out.println("Demo cstr");
	}

	public Demo getDemo() {
		if (demo == null)
			return new Demo();
		return demo;
	}

	public void show() {
		System.out.println("demo method");
	}

}
