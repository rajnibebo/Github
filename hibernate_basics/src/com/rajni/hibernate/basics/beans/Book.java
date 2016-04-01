/**
 * 
 */
package com.rajni.hibernate.basics.beans;

import java.util.Date;
import java.util.List;

/**
 * @author rajni.ubhi
 *
 */
class Book {
	private String isbn;
	private String name;
	private Publisher publisher;
	private int price;
	private Date publishDate;
	private List chapters;
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the publisher
	 */
	public Publisher getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the publishdate
	 */
	public Date getPublishDate() {
		return publishDate;
	}
	/**
	 * @param publishdate the publishdate to set
	 */
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	/**
	 * @return the chapters
	 */
	public List getChapters() {
		return chapters;
	}
	/**
	 * @param chapters the chapters to set
	 */
	public void setChapters(List chapters) {
		this.chapters = chapters;
	}
	
	
}
