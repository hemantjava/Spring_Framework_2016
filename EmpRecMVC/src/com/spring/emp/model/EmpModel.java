package com.spring.emp.model;

import java.util.List;

import com.spring.emp.dao.EmpDAOImpl;
import com.spring.emp.dto.EmployeeDTO;

public class EmpModel {
public List<EmployeeDTO> getemploeeDetails() {
	return new EmpDAOImpl().getList();
}
}
