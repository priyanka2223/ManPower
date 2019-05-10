package com.ts.db;

import java.io.Serializable;




import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ts.dto.Customer;
import com.ts.dto.Category;
import com.ts.dto.Subcategory;
import com.ts.dto.Booking;
import com.ts.dto.Worker;

public class HibernateTemplate {

	private static SessionFactory sessionFactory;
	
	static
	{
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}
	
	public static int addObject(Object obj)
	{
		int result=0;
		
		Transaction tx=null;
		
		try {
			
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			session.save(obj);
			
			tx.commit();
			
			result=1;
			
		} catch (Exception e) {
		
			tx.rollback();
			
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static Object getObject(Class c,Serializable serializable)
	{
		Object obj=null;
		
		try {			
			return sessionFactory.openSession().get(c,serializable);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return obj;
	}
	

	public static List<Object> getObjectListByQuery(String query)
	{
		return sessionFactory.openSession().createQuery(query).list();
	}
	
	public static List<Subcategory> getAllSubCategories(int catId){
		
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from Subcategory where CAT_ID = :cat");
		query.setParameter("cat", catId);
		
		List <Subcategory> subcatList = query.list();
		
		return subcatList;
		
	}
	
	public static Object getObjectByUserName(String userName) {
	
	String queryString = "from Customer where userName = :userName";
	  Query query = sessionFactory.openSession().createQuery(queryString);
	  query.setString("userName", userName);
	  Object queryResult = query.uniqueResult();
	  Customer customer = (Customer)queryResult;
	  System.out.println(customer.getName()+" "+customer.getPassword()); 
	  return customer; 
	}
	
	public static Object getObjectByWorkerName(String userName) {
		
		String queryString = "from Worker where userName = :userName";
		  Query query = sessionFactory.openSession().createQuery(queryString);
		  query.setString("userName", userName);
		  Object queryResult = query.uniqueResult();
		  Worker worker = (Worker)queryResult;
		  System.out.println(worker.getName()+" "+worker.getPassword()); 
		  return worker; 
		}
	
     public static Object getObjectById(int catId) {
		
		String queryString = "from Subcategory where catId = :catId";
		  Query query = sessionFactory.openSession().createQuery(queryString);
		  query.setString(catId,"catId");
		  Object queryResult = query.uniqueResult();
		  Subcategory subcategory = (Subcategory)queryResult;
		  return subcategory; 
		}
	
	
	
	
	
	public static int updateObject(Object obj)
	{
		int result=0;
		
		Transaction tx=null;
		
		try {
			
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			//session.saveOrUpdate(obj);
			session.merge(obj);
			tx.commit();
			
			result=1;
			
		} catch (Exception e) {
		
			tx.rollback();
			
			e.printStackTrace();
		}
		
		return result;
	}
	

	public static int deleteObject(Class c,Serializable serializable)
	{
		int result=0;
		
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		try {
			
			Object obj=session.get(c,serializable);
			
			session.delete(obj);
			
			tx.commit();
			
			result=1;
						
		} catch (Exception e) {
			
			e.printStackTrace();
			
			tx.rollback();
		}
		
		return result;
	}

	public static int getObjectListByStatus(int workId, String status) {
       
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("update Worker set status = :status where workId = :workId");
        query.setParameter("workId",workId);
        query.setParameter("status",status);
        
        int result = query.executeUpdate();
        return result;
		}
}
