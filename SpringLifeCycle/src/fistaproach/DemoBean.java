package fistaproach;

public class DemoBean {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "DemoBean [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void myInit() throws Exception{
		try{
			if(id>=0 || name==null)
				throw new RuntimeException();
		}catch(Exception e){
			System.out.println("check values properlly inserted");
		}	
		System.out.println("init method is executed");
	}
	public void myDestroy() throws Exception{
		System.out.println("destroy method is executed");
		id=0;
		name=null;
	}
	
}