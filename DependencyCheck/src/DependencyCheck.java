import java.util.List;

public class DependencyCheck {
	private int no;
	private List<String> list;
	private Demo demo;

	public DependencyCheck() {
		System.out.println("DependencyCheck");
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Demo getDemo() {
		return demo;
	}

	public void setDemo(Demo demo) {
		this.demo = demo;
	}
}
