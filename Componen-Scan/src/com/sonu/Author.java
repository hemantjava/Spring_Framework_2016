package com.sonu;
import org.springframework.stereotype.Component;

@Component
public class Author {
	private String name="hemant";
	

		@Override
	public String toString() {
		
		return  name ;
	}

}
