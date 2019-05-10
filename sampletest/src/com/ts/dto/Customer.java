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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Customer {
	@Id@GeneratedValue
	private int custId;
	@Column(length=25)
	private String name;
	@Column(length=25)
	private String userName;
	@Column(length=25)
	private String password;
	@Column(length=25)
	private String email;
	@Column(length=25)
	private String phoneNo;

	//@OneToOne(mappedBy="customer")	
	//private Booking booking;
	
	public Customer() {
		super();	
	}

	
	public Customer(String name,String userName,String password,String email,String phoneNo) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	public Customer(int custId,String name,String userName,String email,String phoneNo){
		super();
		this.custId = custId;
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	
	public Customer(int custId,String name,String userName,String password,String email,String phoneNo) {
		super();
		this.custId = custId;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
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


/*	public Booking getBooking() {
		return booking;
	}


	public void setBooking(Booking booking) {
		this.booking = booking;
	}
*/
	
	
}
