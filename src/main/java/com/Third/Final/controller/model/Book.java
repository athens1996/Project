
package com.Third.Final.controller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="book")
@Entity
public class Book {
@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int Bookid;

	@Column
	 String Author_name;
	@Override
	public String toString() {
		
		return "Book [Bid=" + Bookid + ", Author_name=" + Author_name + "]";
	}
	public int getBid() {
		return Bookid;
	}
	public void setBid(int bid) {
		Bookid = bid;
	}
	public String getAuthor_name() {
		return Author_name;
	}
	public void Author_name(String Author_name) {
		this.Author_name = Author_name;
	}
}
