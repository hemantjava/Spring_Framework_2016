package com.spring.emp.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.emp.dao.EmpDAOImpl;
import com.spring.emp.dto.EmployeeDTO;
@Service
public class EmpModel {
	private EmpDAOImpl impl;

	public EmpDAOImpl getImpl() {
		return impl;
	}
    @Autowired(required=true)
	public void setImpl(EmpDAOImpl impl) {
		this.impl = impl;
	}

	public List<EmployeeDTO> getemploeeDetails() {
		return getImpl().getList();
	}
}
