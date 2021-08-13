package both;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DemoBean implements InitializingBean,DisposableBean{
	private int id;
	private String name;
	public void myInit() throws Exception{
		try{
			if(id>=0 || name==null)
				throw new RuntimeException();
		}catch(Exception e){
			System.out.println("check values properlly inserted");
		}	
		System.out.println("init method is executed");
	}
	public void myDestroy() throws Exception{
		System.out.println("destroy method is executed");
		id=0;
		name=null;
	}
	@Override
	public String toString() {
		return "DemoBean [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method is executed");
		id=0;
		name=null;
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		try{
			if(id<=0 || name==null)
				throw new Exception();
		}catch(Exception e){
			System.out.println("check values properlly inserted");
			e.printStackTrace();
		}	
		System.out.println("afterPropertiesSet method is executed");
		
	}
	
}