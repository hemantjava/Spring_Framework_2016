public class B {
	public B() {
		System.out.println("B Defaoult..");
	}

	public void destroy() throws Exception {
		System.out.println("destroy B");

	}

	public void init() throws Exception {
		System.out.println("afterPropertiesSet init B");

	}

}
