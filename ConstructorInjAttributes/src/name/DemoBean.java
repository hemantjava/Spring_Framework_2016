package name;

public class DemoBean {
private String name,pwd;
//constructor injection
public DemoBean(String name,String pwd){
	
	this.name=name;
	this.pwd=pwd;
	System.out.println("parameterized constructor..");
}
public void getMsg(){
	System.out.println(name +":"+pwd);
}
	
}
