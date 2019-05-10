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

import com.ts.dao.WorkerDAO;
import com.ts.dto.Subcategory;
import com.ts.dto.Worker;

@WebServlet("/RegisterWorker")
public class RegisterWorker extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String user = request.getParameter("uid");
		String pass = request.getParameter("pwd");
		int exp = Integer.parseInt(request.getParameter("exp"));
		double charge = Double.parseDouble(request.getParameter("chrg"));
		String pnum = request.getParameter("pnum");
		
		int subId = Integer.parseInt(request.getParameter("subId"));
		Subcategory subcategory = new Subcategory();
		subcategory.setSubId(subId);
	
		Worker worker = new Worker(name,user,pass,exp,charge,pnum,subcategory);		
		WorkerDAO workerDao = new WorkerDAO();
		int x = workerDao.register(worker);
		RequestDispatcher rd = request.getRequestDispatcher("LoginNow.html");
		rd.include(request, response);
	  out.println("<h3><CENTER>Registration Success .."+x+" Rows inserted...</CENTER></H3>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

