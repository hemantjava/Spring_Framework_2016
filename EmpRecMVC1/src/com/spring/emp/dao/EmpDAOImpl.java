package com.spring.emp.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.emp.dto.EmployeeDTO;
@Repository
public class EmpDAOImpl implements EmpDAO {
	private EmployeeDTO dto;
	private List<EmployeeDTO> list;
	public EmployeeDTO getDto() {
		return dto;
	}
    @Autowired(required=true)
	public void setDto(EmployeeDTO dto) {
		this.dto = dto;
	}

	@Override
	public List<EmployeeDTO> getList() {
		
		return list;
	}
	
	public EmpDAOImpl(){
		list=new ArrayList<EmployeeDTO>();
		list.add(new EmployeeDTO("hemant sahu",1234,new Date()));
		list.add(new EmployeeDTO("sonu sahu",1134,new Date()));
		list.add(new EmployeeDTO("ruchi sahu",4234,new Date()));
		list.add(new EmployeeDTO("shiva sahu",1434,new Date()));
	}

}
