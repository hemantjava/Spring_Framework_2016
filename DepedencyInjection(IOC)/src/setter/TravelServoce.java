package setter;
public class TravelServoce {
	private Vehicle vcl;
	TravelServoce(){
		System.out.println("default constructor");
	}
	public Vehicle getVcl() {
		return vcl;
	}

	public void setVcl(Vehicle vcl) {
		this.vcl = vcl;
		System.out.println("setter injection is injected");
	}

	
	void driveBy(){
		vcl.move();
	}

}
