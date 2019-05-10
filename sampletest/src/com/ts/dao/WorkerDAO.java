package com.ts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.Worker;

public class WorkerDAO {

	public Worker getWorker(String user) {

		return (Worker)HibernateTemplate.getObjectByWorkerName(user);
	}

	public int register(Worker worker) {
		return HibernateTemplate.addObject(worker);
	}

	public List<Worker> getAllWorkers() {
		List<Worker> workers=(List)HibernateTemplate.getObjectListByQuery("From Worker");
		System.out.println("Inside All Workers ..."+workers);
		return workers;	
	}

	public Worker getWorker(int id) {
		return (Worker)HibernateTemplate.getObject(Worker.class,id);
	}
	

		public int updateStatus(int workId,String status) {
			Worker worker =getWorker(workId);
			
	        worker.setStatus(status);
			return HibernateTemplate.updateObject(worker);
			
		}
}