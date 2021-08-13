public class DemoBean {
private DemoBean1 db1;
//constructor injection
public DemoBean( DemoBean1 db1){
	
	this.db1=db1;
}
public void getMsg(){
	db1.showMsg();
}
public void showMsg(){
	System.out.println("DemoBean");
}
	
}
