package com.stu.model.dao;

import java.util.List;
import com.stu.model.dto.StudentDTO;

public interface StudentDAO {
	public void insert(StudentDTO st);

	public StudentDTO getRecord(int id);

	public List<StudentDTO> getRecordAll();

	public StudentDTO deleteById(int id);

	public StudentDTO updateById(StudentDTO st);
}
