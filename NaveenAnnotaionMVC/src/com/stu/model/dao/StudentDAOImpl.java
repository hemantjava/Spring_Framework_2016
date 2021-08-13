package com.stu.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.stu.model.dto.StudentDTO;

@Repository
public class StudentDAOImpl implements StudentDAO {
	private HibernateTemplate ht;

	@Autowired
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public void insert(StudentDTO st) {
		ht.save(st);

	}

	@Override
	public StudentDTO getRecord(int id) {
		/*
		 * List<StudentDTO> list=ht.find("from StudentDTO s where s.sid=?",id);
		 * StudentDTO st=list.get(0);
		 */// 1st way
		StudentDTO st = ht.get(StudentDTO.class, id); // 2nd way
		return st;
	}

	@Override
	public List<StudentDTO> getRecordAll() {
		@SuppressWarnings("unchecked")
		List<StudentDTO> list = ht.find("from StudentDTO s");
		return list;
	}

	@Override
	public StudentDTO deleteById(int id) {
		StudentDTO st = ht.get(StudentDTO.class, id);
		ht.delete(st);
		return st;
	}

	@Override
	public StudentDTO updateById(StudentDTO st) {
		ht.update(st);
		return st;
	}

}
