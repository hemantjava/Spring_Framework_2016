package com.stu.service;

import java.util.List;

import com.stu.model.dao.StudentDAO;
import com.stu.model.dto.StudentDTO;

public class StudentService {
	private StudentDAO dao;

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

	public void insertRecord(StudentDTO st) {
		dao.insert(st);
	}

	public StudentDTO getRecord(int id) {
		return dao.getRecord(id);
	}

	public List<StudentDTO> getRecordAll() {
		return dao.getRecordAll();
	}

	public StudentDTO deleteStudent(int id) {

		return dao.deleteById(id);
	}

	public StudentDTO updateStudent(StudentDTO st) {

		return dao.updateById(st);
	}

}
