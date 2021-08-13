public class ServiceClass {
private Contest con;
public void setCon(Contest con){
	this.con=con;
}
public ServiceClass(){
	System.out.println("default");
}
public ServiceClass(Contest con){
	System.out.println("parameterized constructor");
	this.con=con;
}
public String getMesg(){
	return con.getMessage(); 
}
}
