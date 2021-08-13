public class Student {
	private int rno;
	private String sname;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void show(){
		System.out.println("i am learner "+rno +":"+sname);
	}

}
