package constructor;
public class DemoBean {
private int sid;
private String sname;
private SimpleDemo sd;
public DemoBean(){
	System.out.println("default constructor..");
}
public SimpleDemo getSd() {
	return sd;
}
//constructor injection id here..
public  DemoBean(SimpleDemo sd) {
	this.sd = sd;
	System.out.println(" constructor..");

}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
	
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
}
