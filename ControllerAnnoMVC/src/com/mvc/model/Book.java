package com.mvc.model;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Book {
	private Long bookId;
	private String bookName;
	private BigDecimal price; //ava.math.*; package
	private Publisher publisher;
	public Long getBookId() {
		return bookId;
	}
	public Book() {
		System.out.println("book 4");
	}
	public Book(Long bookId, String bookName, BigDecimal price,
			Publisher publisher) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.publisher = publisher;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	@Autowired
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	

}
