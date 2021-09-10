
package com.Third.Final.controller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int Bid;

	@Column
	public String bname;
	@Override
	public String toString() {
		
		return "Book [Bid=" + Bid + ", bname=" + bname + "]";
	}
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
}
