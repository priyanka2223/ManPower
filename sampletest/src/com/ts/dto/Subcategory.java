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
public class Subcategory {
	
	@Id@GeneratedValue
	private int subId;
	@Column(length=25)
	private String subType;
	@Column(length=25)
	private double price;
	
	@OneToOne(mappedBy="subcategory")	
	private Booking bookings;
	
	@ManyToOne
	@JoinColumn(name="CAT_ID")
	private Category category;
	
	
	@OneToMany(mappedBy="subcategory")	
	private List <Worker> workers=new ArrayList<Worker>();
	
	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
	}
	public List<Worker> getWorkers() {
		return workers;
	}
	
	
	
	
	public Subcategory() {
		super();	
	}
	
	public Subcategory(String subType,double price,Category category){
		super();
		this.subType = subType;
		this.price = price;
		this.category = category;
	}
	
	
	public Subcategory(int subId,String subType,double price,Category category){
		super();
		this.subId = subId;
		this.subType = subType;
		this.price = price;
		this.category = category;
	}
	
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Booking getBookings() {
		return bookings;
	}
	public void setBookings(Booking bookings) {
		this.bookings = bookings;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	

}
