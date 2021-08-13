package ref;
public class DemoBean {
private DemoBean1 demoBean;
//setter injection
public DemoBean(DemoBean1 demoBean){
	this.demoBean= demoBean;
}
public DemoBean1 getDemoBean() {
	return demoBean;
}
public void setDemoBean(DemoBean1 demoBean) {
	this.demoBean = demoBean;
}
public void show(){
	demoBean.getMsg();
}
@Override
public String toString() {
	return "DemoBean [demoBean=" + demoBean + "]";
}

}
