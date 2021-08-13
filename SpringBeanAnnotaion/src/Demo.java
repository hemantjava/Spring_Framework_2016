import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("d")
public class Demo {
	private Date dte;
    @Autowired
	public void setDte(Date dte) {
		this.dte = dte;
	}
	public void show(){
		System.out.println(dte);
	}

}
