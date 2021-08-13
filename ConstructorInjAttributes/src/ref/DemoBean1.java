package ref;
public class DemoBean1 {
private String name,pwd;
//constructor injection
public DemoBean1(){
	
	this.name="hemant";
	this.pwd="sahu";
}
@Override
public String toString() {
	return "DemoBean1 [name=" + name + ", pwd=" + pwd + "]";
}
public void getMsg(){
	System.out.println(name +":"+pwd);
}
	
}
