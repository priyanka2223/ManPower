package com.ts.dto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Category {
	@Id@GeneratedValue
	private int catId;
	@Column(length=25)
	private String catType;
	
	@OneToMany(mappedBy="category")	
	private List <Subcategory> subcategorys=new ArrayList<Subcategory>();
	
	public void setSubcategorys(List<Subcategory> subcategorys) {
		this.subcategorys = subcategorys;
	}
	public List<Subcategory> getSubcategorys() {
		return subcategorys;
	}
	public Category() {
		super();
	}

	public Category(String catType) {
		super();
		this.catType = catType;
	}
	public Category(int catId, String catType) {
		super();
		this.catId = catId;
		this.catType = catType;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatType() {
		return catType;
	}
	public void setCatType(String catType) {
		this.catType = catType;
	}
	

}
