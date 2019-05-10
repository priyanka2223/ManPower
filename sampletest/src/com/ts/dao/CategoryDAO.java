package com.ts.dao;

import java.util.List;


import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.Category;

public class CategoryDAO {

	public Category getCategory(String user) {

		return (Category)HibernateTemplate.getObjectByUserName(user);
	}

	public int register(Category category) {
		return HibernateTemplate.addObject(category);
	}

	public List<Category> getAllCategorys() {
		List<Category> categorys=(List)HibernateTemplate.getObjectListByQuery("From Category");
		System.out.println("Inside All Employees ..."+categorys);
		return categorys;	
	}

	public Category getCategory(int id) {
		return (Category)HibernateTemplate.getObject(Category.class,id);
	}

	
}