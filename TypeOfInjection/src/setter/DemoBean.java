package setter;
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
//setter injection id here..
public void setSd(SimpleDemo sd) {
	this.sd = sd;
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
