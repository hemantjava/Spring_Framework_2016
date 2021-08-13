package com.sonu;


public class Book {
	private String name;
	private Author au;
	public void setAu(Author au) {
		this.au = au;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAu() {
		return au;
	}

	@Override
   public String toString() {
	return "Book name"+ name +" "+au;
}
}
