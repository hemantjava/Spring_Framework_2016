package dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dto.Student;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int index) throws SQLException {
		Student s=new Student();
		s.setSid(rs.getInt(1));
		s.setName(rs.getString(2));
		return s;
	}

}
