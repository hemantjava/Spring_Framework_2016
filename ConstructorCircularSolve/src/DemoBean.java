public class DemoBean {
private DemoBean1 db1;
//constructor injection
public void  setDb1( DemoBean1 db1){
	
	this.db1=db1;
}
public void getMsg(){
	db1.showMsg();
}
public void showMsg(){
	System.out.println("class DemoBean msg");
}
	
}
