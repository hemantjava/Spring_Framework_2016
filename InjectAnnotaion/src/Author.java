import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;


public class Author {
	//@Inject --->byType
	private Book book;
	private String name;
	@Inject                 
	@Qualifier(value="id3")////byName
	public void setBook(Book book) {
		System.out.println("str");
		this.book = book;
	}

	public Book getBook() {
		return book;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
