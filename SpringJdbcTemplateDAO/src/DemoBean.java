import org.springframework.jdbc.core.JdbcTemplate;


public class DemoBean {
	private JdbcTemplate jt;
    private OnlineShop os;
	public void setOs(OnlineShop os) {
		this.os = os;
	}
	public DemoBean(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}
	public void create(){
		//execute for DDL operation
		jt.execute("create table shop(id varchar(20),name varchar(20),addres varchar(20))");
		System.out.println("table is created");
	}
	public void insert(OnlineShop os){
		/*update for DML operation*/
		Object[] obj={os.getId(),os.getName(),os.getAddr()};
		int a=jt.update("insert into shop values(?,?,?)",obj);
	    
		if(a>0)
	    	System.out.println("number of record inserted:"+a);
	}

}
