public class Injection {
private Student str;
public Student getStr() {
	return str;
}
//setter injection
public void setStr(Student str) {
	System.out.println("setter injection is injected");
	this.str = str;
}
public Injection(){}
//constructor injection
public Injection(Student str){

	System.out.println("constructor injection is injected");
	this.str=str;
	
}
public void show(){

System.out.println("roll number :"+str.getRno());
System.out.println("student name :"+str.getSname());
	
}
}
