package com.ts.web;

import java.io.IOException;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.BookingDAO;
import com.ts.dto.Booking;
import com.ts.dto.Subcategory;

@WebServlet("/BookNow")
public class BookNow extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String number = request.getParameter("number");
		String address = request.getParameter("address");
		String date1 = request.getParameter("date");
        Date date2 = null;
        try{
        	date2 = new SimpleDateFormat("yyyy-mm-dd").parse(date1);
        }
        catch(ParseException e){
        	e.printStackTrace();
        }
		java.sql.Date date = new java.sql.Date(date2.getTime());
		int subId = Integer.parseInt(request.getParameter("subId"));
		Subcategory subcategory = new Subcategory();
		subcategory.setSubId(subId);
	
		Booking booking = new Booking(name,email,number,address,date,subcategory);		
		BookingDAO bookingDao = new BookingDAO();
		int x = bookingDao.register(booking);
		out.println("<h3><CENTER>Booking is Successfully done .."+"</CENTER></H3>");	
		RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");
		rd.include(request, response);
	//  out.println("<h3><CENTER>Booking is Successfull .."+x+"</CENTER></H3>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

