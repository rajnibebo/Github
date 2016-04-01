/**
 * 
 */
package com.rajni.hib.apress.mapping.annotation.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity(name="bkCh2")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
@Table(name="BOOK_CH2")
public class BookCh2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="isbn")
	private Long isbn;
	
	@Column(name="book_name")
	private String bookName;
	
	@Column(name="publish_date")
	private Date publishDate;
	
	@Column(name="publisher_code")
	private String publisherCode;
	
	@Column(name="price")
	private Long price;
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
	
	
}
