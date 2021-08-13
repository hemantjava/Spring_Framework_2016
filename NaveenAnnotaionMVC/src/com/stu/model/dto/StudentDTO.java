package com.stu.model.dto;

import org.springframework.stereotype.Component;

@Component
public class StudentDTO {
	private int sid;
	private String sname;
	private String addrs;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public StudentDTO(int sid, String sname, String addrs) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.addrs = addrs;
	}

	public StudentDTO() {
	}

}
