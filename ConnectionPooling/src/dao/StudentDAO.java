package dao;
import java.util.List;
import dto.Student;
public interface StudentDAO {
	void insertRecord(Student st);
	 void updateRecord(Student st);
	List<Student> selectRecord();
	void selectForRowSet();
	void batchUpdate();
	void selectRowMapper();
	void selectResultSetExtractor();
	void deleteRedcord(int id);

}
