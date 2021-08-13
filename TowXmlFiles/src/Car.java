
public class Car {
	private String name;
	private Engine en;
	public Car() {
		System.out.println(" default ctr Car()");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Engine getEn() {
		return en;
	}
	public void setEn(Engine en) {
		this.en = en;
	}
	public void result(){
		System.out.println("car:"+getName()+" model :"+getEn().getName());
	}

}
