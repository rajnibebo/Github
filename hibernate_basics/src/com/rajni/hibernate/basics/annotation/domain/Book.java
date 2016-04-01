/**
 * 
 */
package com.rajni.hibernate.basics.annotation.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name="BOOK")
public class Book {
	@Column(name="isbn")
	@Id
	private String isbn;
	
	@Column(name="BOOK_NAME")
	private String bookName;
	
	@Column(name="PUBLISH_DATE")
	private Date publishDate;
	
	@Column(name="PUBLISHER_CODE")
	private String publisherCode;
	
	@Column(name="price")
	private Long price;

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
	 * @return the publisherCode
	 */
	public String getPublisherCode() {
		return publisherCode;
	}

	/**
	 * @param publisherCode the publisherCode to set
	 */
	public void setPublisherCode(String publisherCode) {
		this.publisherCode = publisherCode;
	}

	/**
	 * @return the price
	 */
	public Long getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Long price) {
		this.price = price;
	}
	
	public String toString() {
		return "Book[ISBN :"+isbn+", Name : "+bookName+", publisher Code : "+publisherCode+", price : "+price+"]";
	}
}
