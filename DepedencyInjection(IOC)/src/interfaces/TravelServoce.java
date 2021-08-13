package interfaces;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TravelServoce implements ApplicationContextAware {
	private Vehicle vcl;
	private ApplicationContext atx;
	TravelServoce(){
		System.out.println("default constructor");
	}
	public Vehicle getVcl() {
		return vcl;
	}



	
	void driveBy(){
		vcl.move();
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0)
	         
			throws BeansException {
		atx=arg0;
		
	}

}
