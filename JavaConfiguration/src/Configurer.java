import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurer {
    @Bean
	public Book getBook(){
		Book b=new Book();
		b.setName("java");
		b.setPrice(231);
		return b;
	}
	@Bean
	public Author getAuthor(){
		Author a=new Author();
		a.setBook(getBook());
		a.setName("hemant");
		return a;
		
	}

}
