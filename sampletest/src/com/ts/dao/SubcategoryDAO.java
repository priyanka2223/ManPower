package com.ts.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import com.ts.db.HibernateTemplate;

import com.ts.dto.Subcategory;

public class SubcategoryDAO {

private SessionFactory factory = null;
	
	public Subcategory getSubcategory(String user) {

		return (Subcategory)HibernateTemplate.getObjectByUserName(user);
	}

	public int register(Subcategory subcategory) {
		return HibernateTemplate.addObject(subcategory);
	}
	
	public List<Subcategory> getAllSubcategorys() {
		List<Subcategory> subcategorys=(List)HibernateTemplate.getObjectListByQuery("From Subcategory");
		System.out.println("Inside All Subcategorys ..."+subcategorys);
		return subcategorys;	
	}

	public  List<Subcategory> getAllSubcategorys(int catId) {
		
		List<Subcategory> subcategorys=(List)HibernateTemplate.getAllSubCategories(catId);
		System.out.println("Inside All Subcategorys ..."+subcategorys);
		return subcategorys;	
	}
	
}