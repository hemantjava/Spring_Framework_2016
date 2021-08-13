

public class A {
	private static int a;
	private static int b[];

	public static void setA(int a) {
		A.a = a;
	}

	public static void setB(int[] b) {
		A.b = b;
	}

	public A() {
		System.out.println("A Defaoult..");
	}

	public void result() {
		System.out.println("a:" + a);
		for (int i =0;i<b.length;i++) {
			System.out.println("b[" + i + "]:" + b[i]);
		}
	}

}
