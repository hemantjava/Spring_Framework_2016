
public class DemoBean implements Demo {

	TestBeanExplicit te;
	public DemoBean(){}
	public DemoBean(TestBeanExplicit te) {
		super();
		this.te = te;
		System.out.println("constructor");
	}
	
	public TestBeanExplicit getTe() {
		return te;
	}
	public void setTe(TestBeanExplicit te) {
		this.te = te;
		System.out.println("setter ");
	}
	@Override
	public void result() {
		try{
	    System.out.println(te.getName());
	
	
		}catch(Exception e){
			System.out.println("exception has occured");
		}
		
	}

}
