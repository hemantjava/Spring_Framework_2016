package over;
public class DemoBean {
private String name;
private int rno;
public void setName(String name) {
	this.name = name;
	System.out.println("setter....names");

}
public void setRno(int rno) {
	this.rno = rno;
	System.out.println("setter....rno");

}
public String getName() {
	return name;
}
public int getRno() {
	return rno;
}	
public DemoBean(String name,int rno){
	this.name=name;
	this.rno=rno;
	System.out.println("constructor....");
}
}
