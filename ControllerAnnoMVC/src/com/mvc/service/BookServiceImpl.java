package com.mvc.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.doa.BookDAO;
import com.mvc.model.Book;

@Service
public class BookServiceImpl implements BookService {

   private BookDAO dao;
	public BookDAO getDao() {
	return dao;
}
	@Autowired
public void setDao(BookDAO dao) {
	this.dao = dao;
}
	@Override
	public List<Book> getBookList() {
		
		return dao.getBookList();
	}
	public BookServiceImpl() {
		System.out.println("BookServiceImpl  2");
	}

}
