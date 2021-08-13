package type;

public class DemoBean {
private String name;
private int pwd;
//constructor injection
public DemoBean(String name,int pwd){
	
	this.name=name;
	this.pwd=pwd;
}
public void getMsg(){
	System.out.println(name +":"+pwd);
}
	
}
