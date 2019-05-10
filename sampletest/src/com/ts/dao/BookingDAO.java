package com.ts.dao;

import java.util.List;


import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.Booking;

public class BookingDAO {

	private SessionFactory factory = null;
	
	public Booking getBooking(String user) {

		return (Booking)HibernateTemplate.getObjectByUserName(user);
	}

	public int register(Booking booking) {
		return HibernateTemplate.addObject(booking);
	}

	public List<Booking> getAllBookings() {
		List<Booking> bookings=(List)HibernateTemplate.getObjectListByQuery("From Booking");
		System.out.println("Inside All Bookings ..."+bookings);
		return bookings;	
	}

	public Booking getBooking(int id) {
		return (Booking)HibernateTemplate.getObject(Booking.class,id);
	}
}