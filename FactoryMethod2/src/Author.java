
public class Author {
	private String name;
	private Book book;
	public void setBook(Book book) {
		this.book = book;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void result() {
		System.out.println("auther is:"+name+" and book is:"+book.getName());
	}

}
