package dao;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import dao.extractor.StudentExtractor;
import dao.mapper.StudentMapper;
import dto.Student;

public class StudentDAOImpl implements StudentDAO{
private JdbcTemplate jt;
	public JdbcTemplate getJt() {
	return jt;
}

public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}

	@Override
	public void insertRecord(Student st) {
		String qry="insert into student values(?,?)";
		int sid=st.getSid();
		String name=st.getName();
//				int k=jt.update(qry,new Object[]{sid,name});
            int k=jt.update(qry,sid,name);//spring 3.0 version(preferred)
            Date date=(Date)jt.queryForObject("select sysdate from dual",java.util.Date.class);
		System.out.println("number of record inserted:"+k+" and date:"+date);
		
	}


	@Override
	public List<Student> selectRecord() {
		String qry="select *from student";
	   List ls= jt.queryForList(qry);
	   Iterator it=ls.iterator();
	   while(it.hasNext()){
		   Map m=(Map)it.next();
		   Set s=m.entrySet();
		   Iterator i=s.iterator();
		   while (i.hasNext()) {
			Map.Entry me=(Map.Entry)i.next();
			System.out.println(me.getValue());
		}
	   }
		return ls;
	}

	@Override
	public void updateRecord(Student st) {
		String qry="update student set name=? where sid=?";
		int sid=st.getSid();
		String name=st.getName();
//				int k=jt.update(qry,new Object[]{sid,name});
            int k=jt.update(qry,name,sid);//spring 3.0 version(preferred)
            Date date=(Date)jt.queryForObject("select sysdate from dual",java.util.Date.class);
		System.out.println("number of record updated:"+k+" and date:"+date);
		
		
	}
	public void listEmp(){
		String qry="select *from emp";
		SqlRowSet srs=jt.queryForRowSet(qry);
		while(srs.next()){
			System.out.println(srs.getInt(1)+" "+srs.getString(2)+" "+srs.getFloat(3)+" "+srs.getInt(4));
		}
	
	}

	@Override
	public void selectForRowSet() {//preferable for select operation.
		String qry="select *from student";
		SqlRowSet srs=jt.queryForRowSet(qry);
		while(srs.next()){
			System.out.println(srs.getInt(1)+" "+srs.getString(2));
		}
	}

	@Override
	public void batchUpdate() {
		String sttr[]={"insert into student values(432,'hemant')","update student set sname='naveen' where sid=12345","delete from student where sid=12343434"};
		int k[]=jt.batchUpdate(sttr);
		int a=0;
		for(int d:k){
			a++;
		}
		System.out.println("number of record effected:"+a);
	}

	@Override
	public void selectRowMapper() {
	List<Student> list=jt.query("select *from student",new StudentMapper());
	   Iterator<Student> it=list.iterator();
	   while(it.hasNext()){
		   Student s=it.next();
		   System.out.println(s.getSid()+" "+s.getName());
	   }
		
	}

	@Override
	public void selectResultSetExtractor() {
		/*List<Student> list=(List<Student>)jt.query("select *from student",new StudentExtractor());
	     for(Student s:list){
	    	 System.out.println(s.getName()+" "+s.getSid());
	     }*/
	 	Set<Student> set=(Set<Student>)jt.query("select *from student",new StudentExtractor());
	     for(Student s:set){
	    	 System.out.println(s.getName()+" "+s.getSid());
	     }
		
	}

	@Override
	public void deleteRedcord(int id) {
		String qry="delete from student where sid=?";
		int sid=id;
            int k=jt.update(qry,sid);//spring 3.0 version(preferred)
            Date date=(Date)jt.queryForObject("select sysdate from dual",java.util.Date.class);
		System.out.println("number of record deleted:"+k+" and date:"+date);
		
	}

}
