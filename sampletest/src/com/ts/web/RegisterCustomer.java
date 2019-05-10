package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.CustomerDAO;
import com.ts.dto.Customer;

@WebServlet("/RegisterCustomer")
public class RegisterCustomer extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String user = request.getParameter("uid");
		String pass = request.getParameter("pwd");
		String email = request.getParameter("email");
		String pnum = request.getParameter("pnum");
	
		Customer customer = new Customer(name,user,pass,email,pnum);		
		CustomerDAO customerDao = new CustomerDAO();
		int x = customerDao.register(customer);
		RequestDispatcher rd = request.getRequestDispatcher("LoginNow.html");
		rd.include(request, response);
	  out.println("<h3><CENTER>Registration Success .."+x+" Rows inserted...</CENTER></H3>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

