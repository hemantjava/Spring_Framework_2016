package dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import dto.Student;

public class StudentExtractor1 implements ResultSetExtractor<Object> {

	@Override
	public Object extractData(ResultSet rs) throws SQLException,
			DataAccessException {
		System.out.println("--------------------------");
		System.out.println("List           "+this.getClass().getName());
		System.out.println("-----------------------------");
		List<Student> list=new ArrayList<Student>();
		while(rs.next()){
			Student s=new Student();
			s.setSid(rs.getInt(1));
			s.setName(rs.getString(2));
			list.add(s);
			
		}
		return list;
	}
}


