import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class A  implements InitializingBean,DisposableBean{
public A(){
	System.out.println("A Defaoult..");
}

@Override
public void destroy() throws Exception {
	System.out.println("destroy A");
	
}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("afterPropertiesSet A");
	
}

}
