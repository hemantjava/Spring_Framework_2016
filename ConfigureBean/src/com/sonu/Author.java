package com.sonu;
public class Author {
	private String name,addr;

	public String getName() {
		return name;
	}
	public Author(){}
	public Author(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Author name=" + name + ", addr=" + addr ;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}


}
