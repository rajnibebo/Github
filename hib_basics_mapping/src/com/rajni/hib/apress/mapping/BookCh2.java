/**
 * 
 */
package com.rajni.hib.apress.mapping;

import java.util.Date;
import java.util.List;

/**
 * @author rajni.ubhi
 *
 */
public class BookCh2 {
	private Long isbn;
	private String bookName;
	private Date publishDate;
	private int price;
	private String publisherCode;
	private List chapters;
	/**
	 * @return the isbn
	 */
	public Long getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the publishDate
	 */
	public Date getPublishDate() {
		return publishDate;
	}
	/**
	 * @param publishDate the publishDate to set
	 */
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
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
	 * @return the publisher
	 */
	public String getPublisherCode() {
		return publisherCode;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisherCode(String publisherCode) {
		this.publisherCode = publisherCode;
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
