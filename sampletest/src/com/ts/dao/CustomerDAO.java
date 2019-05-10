package com.ts.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import com.ts.db.HibernateTemplate;
import com.ts.dto.Customer;

public class CustomerDAO {

	private SessionFactory factory = null;
	
	public Customer getCustomer(String user) {

		return (Customer)HibernateTemplate.getObjectByUserName(user);
	}

	public int register(Customer customer) {
		return HibernateTemplate.addObject(customer);
	}

	public List<Customer> getAllCustomers() {
		List<Customer> customers=(List)HibernateTemplate.getObjectListByQuery("From Customer");
		System.out.println("Inside All Customers ..."+customers);
		return customers;	
	}

	public Customer getCustomer(int id) {
		return (Customer)HibernateTemplate.getObject(Customer.class,id);
	}
	public void deleteCustomer(int custId){
		HibernateTemplate.deleteObject(Customer.class,custId);
	}

	public int updateCustomer(Customer customer) {
		HibernateTemplate.updateObject(customer);
		return 0;
	}
}