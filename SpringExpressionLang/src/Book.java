

public class Book {
	private static Book book;
	Book(){}
	Book(int a){
		System.out.println(" constructor book");
	}
    public static Book getInstance(){
    	if(book==null)
    		return new Book(12);
    	else
    		return book;
    	
    }
  
	

}
