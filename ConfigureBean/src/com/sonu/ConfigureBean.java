package com.sonu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureBean {
	@Bean
	public Author getAuthor(){
		Author a=new Author();
		a.setName("hemant");
		a.setAddr("chr");
		return a;
		
	}
	@Bean
	public Book getBook(){
		Book b=new Book();
		b.setName("java");
		b.setAu(getAuthor());
		return b;
	}

}
