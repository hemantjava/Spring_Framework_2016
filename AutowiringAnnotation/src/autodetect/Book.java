package autodetect;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	@Autowired
    private	Author author;
	private int isbn;
	private String year;
	public Author getAuthor() {
		return author;
	}
	//without setter and constructor injection we can do dependency injection
	Book() {
		System.out.println("default");
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString(){
	return"isbn:"+isbn+"\nyear:"+"\nauthor:"+author.toString();	
	}
}
