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

import com.ts.dao.SubcategoryDAO;
import com.ts.dto.Category;
import com.ts.dto.Subcategory;

@WebServlet("/AddSubcategory")
public class AddSubcategory extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		double price = Double.parseDouble(request.getParameter("price"));
		int catId = Integer.parseInt(request.getParameter("catId"));
		Category category = new Category();
		category.setCatId(catId);
		Subcategory subcategory = new Subcategory(name,price,category);		
		SubcategoryDAO subcategoryDao = new SubcategoryDAO();
		int x = subcategoryDao.register(subcategory);
		RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp");
		rd.include(request, response);
	  out.println("<h3><CENTER>added Successfully .."+x+" Rows inserted...</CENTER></H3>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

