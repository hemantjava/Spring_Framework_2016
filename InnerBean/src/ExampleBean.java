public class ExampleBean {
	private DemoBean db;

	public void show() {
		System.out.println(db);

		db.show();
	}
	//setter injection by spring container..
	public void setDb(DemoBean db) {
		this.db = db;
	}
}
