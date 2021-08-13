
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;


public class OnStopListener implements ApplicationListener<ContextStoppedEvent> {


	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {
		System.out.println("IOC stop.............");
		
	}

	

}
