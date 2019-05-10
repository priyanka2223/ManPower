package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.CategoryDAO;
import com.ts.dto.Category;

@WebServlet("/DisplayCategory")
public class DisplayCategory extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();		
		CategoryDAO categoryDAO = new CategoryDAO();
		List<Category> arrayList = categoryDAO.getAllCategorys();

		request.setAttribute("categorysData", arrayList);
		RequestDispatcher rd = request.getRequestDispatcher("DisplayCategory.jsp");
		rd.forward(request, response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}