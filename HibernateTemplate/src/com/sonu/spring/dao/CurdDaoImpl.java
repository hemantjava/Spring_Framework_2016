package com.sonu.spring.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.sonu.spring.model.StudentDTO;

public class CurdDaoImpl implements CurdDao {
private HibernateTemplate ht;
    //setter injection
	public void setHt(HibernateTemplate ht) {
	this.ht = ht;
}

	@Override
	public void save(StudentDTO save) {
		ht.save(save);
	}

	@Override
	public void update(StudentDTO update) {
		ht.update(update);
		
	}

	@Override
	public void delete(StudentDTO delete) {
		ht.delete(delete);
		
	}

	@Override
	public List<StudentDTO> findStudent() {
		List<StudentDTO> list=(List<StudentDTO>)ht.find("from StudentDTO s");
	
		return list;
	}

}
