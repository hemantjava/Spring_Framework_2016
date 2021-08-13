
public class Test {

	public static void main(String[] args) {
		Configurer c=new Configurer();
	   System.out.println(c.getAuthor().getName()+"  "+c.getAuthor().getBook().getName()+" "+c.getAuthor().getBook().getPrice());

	}

}
