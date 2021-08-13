package byname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Book {
	
    private	Author ur;
	private int isbn;
	private String year;
	public Author getAuthor() {
		return ur;
	}
	public  Book() {
		
		System.out.println("default constructor injection...");
	}
	public Book(Author author) {
		this.ur = author;
		System.out.println("constructor injection...");
	}
	@Autowired
	@Qualifier("soni")//@Qualifier("id") for resolve ambiguity if multiple same beans type type available
	public void setAuthor(Author ur) {
		this.ur = ur;
		System.out.println("setter injection...");

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
		return"isbn:"+isbn+"\nyear:"+year+ur.toString();	
	}
}
