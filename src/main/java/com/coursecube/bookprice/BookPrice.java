package com.coursecube.bookprice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="mybookprice",schema = "jlcbookpricedb")
public class BookPrice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="bookId_generator")
	@SequenceGenerator(name="bookId_generator",sequenceName="mybookId_gen",initialValue=110,allocationSize=1)
	@Column(name="book_Id")
	private Integer bookId;
	
	@Column(name="price")
	private double price;
	
	@Column(name="offer")
	private double offer;

	public BookPrice() {
		System.out.println("BookPrice - D.C");
	}
	
	public BookPrice(Integer bookId, double price, double offer) {
		super();
		System.out.println("BookPrice -parameteried Cons.");		
		this.bookId = bookId;
		this.price = price;
		this.offer = offer;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getOffer() {
		return offer;
	}

	public void setOffer(double offer) {
		this.offer = offer;
	}

	
}
