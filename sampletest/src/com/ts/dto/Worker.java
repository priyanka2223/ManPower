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
public class Worker {
	@Id@GeneratedValue
	private int workId;
	@Column(length=25)
	private String name;
	@Column(length=25)
	private String userName;
	@Column(length=25)
	private String password;
	@Column(length=25)
	private int exp;
	@Column(length=25)
	private double charges;
	@Column(length=25)
	private String phoneNo;
	@Column(length=25)
	private String status;
	
	@ManyToOne
	@JoinColumn(name="SUB_ID")
	private Subcategory subcategory;
	
	/*@OneToOne(mappedBy="worker")	
	private Booking bookings;
	*/
	
	public Worker() {
		super();	
	}

	public Worker(String name,String userName, String password,int exp,double charges,String phoneNo,Subcategory subcategory) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.exp = exp;
		this.charges = charges;
		this.phoneNo = phoneNo;
		this.status = "pending";
		this.subcategory = subcategory;
	}
	public Worker(int workId,String name,String userName,int exp,double charges,String phoneNo){
		super();
		this.workId = workId;
		this.name = name;
		this.userName = userName;
		this.exp = exp;
		this.charges = charges;
		this.phoneNo = phoneNo;
		this.status = "pending";
	}
	
	public Worker(int workId,String name,String userName, String password,int exp,double charges,String phoneNo,Subcategory subcategory) {
		super();
		this.workId = workId;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.exp = exp;
		this.charges = charges;
		this.phoneNo = phoneNo;
		this.status = "pending";
		this.subcategory = subcategory;
	}



	public int getWorkId() {
		return workId;
	}

	public void setWorkId(int workId) {
		this.workId = workId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Subcategory getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(Subcategory subcategory) {
		this.subcategory = subcategory;
	}
	
	/*public Booking getBookings() {
		return bookings;
	}
	public void setBookings(Booking bookings) {
		this.bookings = bookings;
	}*/
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



}
