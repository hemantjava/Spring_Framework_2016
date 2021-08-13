public class DemoBean1 {
private DemoBean db;
//constructor injection
public DemoBean1( DemoBean db){
	
	this.db=db;
}
public void getMsg(){
	db.showMsg();
}
public void showMsg(){
	System.out.println("DemoBean1");
}
	
}
