package com.mvc.doa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.mvc.model.Book;
import com.mvc.model.Publisher;

public class BookDAOImpl implements BookDAO{
	/*
	 * //NOTE:- Long l=10l; //l mandatory BigDecimal bd=new
	 * BigDecimal(123);//obj mandatory
	 */private List<Book> list;

	public BookDAOImpl() {
		list = new ArrayList<Book>();
		list.add(new Book(111l, "java", new BigDecimal(650), new Publisher(11l,
				"james goshling")));
		list.add(new Book(222l, "c", new BigDecimal(150), new Publisher(22l,
				"denis richi")));
		list.add(new Book(333l, "spring", new BigDecimal(750), new Publisher(
				33l, "rod jonshon")));
		list.add(new Book(444l, "hibernate", new BigDecimal(550),
				new Publisher(55l, "galwin king")));
	}

	@Override
	public List<Book> getBookList() {
		
		return list;
	}

}
