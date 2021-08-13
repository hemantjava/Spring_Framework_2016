public class Book {
	private String name;
	private static Book book = null;//static data member

	public static Book getBook() {
		System.out.println("book");
		if (book == null)
			return new Book();
		return book;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
