package com.spring.emp.dto;

import java.util.Date;
public class EmployeeDTO {
	private String name;
	private int id;
	private Date date;
	public EmployeeDTO() {
		
	}
	public EmployeeDTO(String name, int id, Date date) {
		super();
		this.name = name;
		this.id = id;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public Date getDate() {
		return date;
	}


}
