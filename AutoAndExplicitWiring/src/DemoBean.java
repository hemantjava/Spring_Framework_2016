
public class DemoBean implements Demo {
	TestBeanAutowired ta;
	TestBeanExplicit te;
	public DemoBean(){}
	public DemoBean(TestBeanAutowired ta, TestBeanExplicit te) {
		super();
		this.ta = ta;
		this.te = te;
		System.out.println("constructor");
	}
	public TestBeanAutowired getTa() {
		return ta;
	}
	public void setTa(TestBeanAutowired ta) {
		this.ta = ta;
	}
	public TestBeanExplicit getTe() {
		return te;
	}
	public void setTe(TestBeanExplicit te) {
		this.te = te;
	}
	@Override
	public void result() {
		try{
	    //System.out.println(te.getName());
		System.out.println(ta.getName());
	
		}catch(Exception e){
			System.out.println("exception has occured");
		}
		
	}

}
