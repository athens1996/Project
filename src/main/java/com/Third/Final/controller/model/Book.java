

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
	public String Author_name;
	@Override
	public String toString() {
		
		return "Book [Bid=" + Bookid + ", bname=" + Author_name + "]";
	}
	public int getBid() {
		return Bookid;
	}
	public void setBid(int bid) {
		Bookid = bid;
	}
	public String getBname() {
		return Author_name;
	}
	public void setBname(String bname) {
		this.Author_name = bname;
	}
}
