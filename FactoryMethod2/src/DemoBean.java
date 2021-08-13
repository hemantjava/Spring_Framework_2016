
public class DemoBean {
	private String name;
	private Demo demo;
	public void setDemo(Demo demo) {
		this.demo = demo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void msg() {
		System.out.println("DemoBean method:"+name);
		demo.show();
		
	}

}
