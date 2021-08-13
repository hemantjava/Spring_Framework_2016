public class DemoBean1 {
private DemoBean db;
//constructor injection
public void  setDb( DemoBean db){
	
	this.db=db;
}
public void getMsg(){
	db.showMsg();
}
public void showMsg(){
	System.out.println("class DemoBean1 msg");
}
	
}
