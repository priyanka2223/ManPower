package com.ts.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Booking {
	@Id@GeneratedValue
	private int bookId;
	@Column(length=25)
	private String name;
	@Column(length=25)
	private String email;
	@Column(length=25)
	private String phoneNo;
	@Column(length=25)
	private String address;
	@Column(length=25)
	private Date date;
	
	/*@OneToOne
	@JoinColumn(name="CUST_ID")
	private Customer customer;*/
	
	@OneToOne
	@JoinColumn(name="SUB_ID")
	private Subcategory subcategory;
	
	/*@OneToOne
	@JoinColumn(name="WORK_ID")
	private Worker worker;
 	*/
	
	public Booking() {
		super();	
	}
	
	public Booking(int bookId,String name, String email, String phoneNo, String address, java.sql.Date date,Subcategory subcategory) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.email = email;
		this.phoneNo =phoneNo;
		this.address = address;
		this.date = date;
		this.subcategory = subcategory;
		
		
	}
	public Booking(String name, String email, String phoneNo, String address, java.sql.Date date,Subcategory subcategory) {
		this.name = name;
		this.email = email;
		this.phoneNo =phoneNo;
		this.address = address;
		this.date = date;
		this.subcategory = subcategory;
		
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Subcategory getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(Subcategory subcategory) {
		this.subcategory = subcategory;
	}

	
	
}
