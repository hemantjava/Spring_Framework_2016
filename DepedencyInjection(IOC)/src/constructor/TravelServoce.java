package constructor;
public class TravelServoce {
	private Vehicle vcl;
	TravelServoce(){
		System.out.println("default constructor");
	}
	public Vehicle getVcl() {
		return vcl;
	}

	public  TravelServoce(Vehicle vcl) {
		this.vcl = vcl;
		System.out.println("constructor injection is injected");
	}

	
	void driveBy(){
		vcl.move();
	}

}
