package com.ts.web;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.CategoryDAO;
import com.ts.dao.SubcategoryDAO;
import com.ts.dto.Category;
import com.ts.dto.Subcategory;

@WebServlet("/AddCategory")
public class AddCategory extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String catType = request.getParameter("catType");
		
		//int catId = Integer.parseInt(request.getParameter("catId"));
		Category category = new Category(catType);		
		CategoryDAO categoryDao = new CategoryDAO();
		int x = categoryDao.register(category);
		RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp");
		rd.include(request, response);
	  out.println("<h3><CENTER>Added Successfully .."+x+" Rows inserted...</CENTER></H3>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}	

}
