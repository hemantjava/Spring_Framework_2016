
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;


public class OnCloseListener implements ApplicationListener<ContextClosedEvent> {



	@Override
	public void onApplicationEvent(ContextClosedEvent arg0) {
		System.out.println("IOC close.............");
		
	}

	

}
