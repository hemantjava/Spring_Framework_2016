import javax.annotation.Resource;
public class Author {
	//@Resource(name="id1") also allowed
	@Resource  // by Name
	private Book book;
	private String name;
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
