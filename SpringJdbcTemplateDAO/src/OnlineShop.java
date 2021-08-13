public class OnlineShop {
	private String id;
	private String name;
	private String addr;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public OnlineShop() {
	}

	@Override
	public String toString() {
		return "OnlineShop [id=" + id + ", name=" + name + ", addr=" + addr
				+ "]";
	}

	public OnlineShop(String id, String name, String addr) {
		this.id = id;
		this.name = name;
		this.addr = addr;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
