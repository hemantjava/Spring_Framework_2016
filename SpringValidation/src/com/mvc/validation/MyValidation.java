package com.mvc.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.mvc.model.Book;
@Component
public class MyValidation implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		
		return arg0.equals(Book.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Book book = (Book)target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bookName", "Required Field");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bookId", "Required Field");
		if(!errors.hasFieldErrors("price")){
			if(book.getPrice().intValue()==0)
				errors.rejectValue("price","not_zero","can not be left empty...");
		}
		
	}

}
