package com.mvc.model;

import org.springframework.stereotype.Component;

@Component
public class Publisher {
	private Long publisherId;
	private String publisherName;
	public Publisher(Long publisherId, String publisherName) {
		this.publisherId = publisherId;
		this.publisherName = publisherName;
	}
	public Publisher() {
		System.out.println("publisher 5");

	}
	public Long getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

}
