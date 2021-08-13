package byname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//denote bean configuration 
public class Book {
	//@Autowired //1
    private	Author author;
	private int isbn;
	private String year;
	public Author getAuthor() {
		return author;
	}
	public  Book() {
		
		System.out.println("default constructor injection...");
	}
	@Autowired //2
	public Book(Author author) {
		this.author = author;
		System.out.println("constructor injection...");
	}
	//@Autowired //3
	public void setAuthor(Author author) {
		this.author = author;
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
		return"isbn:"+isbn+"\nyear:"+year+author.toString();	
	}
}
