package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.ts.dao.CustomerDAO;
import com.ts.dao.WorkerDAO;
import com.ts.dto.Customer;
import com.ts.dto.Worker;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String user = request.getParameter("uid");
		String pass = request.getParameter("pwd");
		String type = request.getParameter("login");
	    System.out.println(user+" "+type);
	    
	  if(type.equalsIgnoreCase("Worker")){
		  System.out.println("inside worker"+type);
			WorkerDAO workerDao = new WorkerDAO();
			Worker worker = workerDao.getWorker(user);
			System.out.println(worker);
			out.print("<html>");		
			if(worker!=null  && worker.getStatus().equalsIgnoreCase("Yes")){
				HttpSession session = request.getSession(true);
				session.setAttribute("user", user);
				session.setAttribute("pass", pass);
				session.setAttribute("workId", worker.getWorkId());
				RequestDispatcher rd = request.getRequestDispatcher("WorkerHomePage.jsp");
				rd.include(request, response);
			}
			else
			{
				out.print("<body>");
				out.print("<center><h1>Invalid Credentials..</h1></center>");
				RequestDispatcher rd = request.getRequestDispatcher("LoginNow.html");
				rd.include(request, response);
				out.print("</body>");	
			}
			
		}
		else{
		CustomerDAO customerDao = new CustomerDAO();
		Customer customer = customerDao.getCustomer(user);
		
		out.print("<html>");		
		if(customer!=null){
			HttpSession session = request.getSession(true);
			session.setAttribute("user", user);
			session.setAttribute("pass", pass);
			session.setAttribute("custId", customer.getCustId());
			if(customer.getPassword().equalsIgnoreCase("PASSWORD")) {
				RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp");
				rd.include(request, response);	
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");
				rd.forward(request, response);
			}
			

		}
		else
		{
			out.print("<body>");
			out.print("<center><h1>Invalid Credentials..</h1></center>");
			RequestDispatcher rd = request.getRequestDispatcher("LoginNow.html");
			rd.include(request, response);
			out.print("</body>");			
		}
		out.println("</html>");		
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}
	

}
