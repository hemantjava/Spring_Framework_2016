package bytype;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Book implements ApplicationContextAware {
	ApplicationContext actx;
    public ApplicationContext getActx() {
		return actx;
	}
	private	Author author;
	private int isbn;
	private String year;
	public Author getAuthor() {
		return author;
	}
	public  Book() {
		
		System.out.println("default constructor injection...");
	}
	public  Book(Author author) {
		this.author = author;
		System.out.println("constructor injection...");
	}
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
	@Override
	public void setApplicationContext(ApplicationContext actx)
			throws BeansException {
		this.actx=actx;
		
	}
}
