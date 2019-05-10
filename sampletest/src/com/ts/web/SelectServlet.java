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
import javax.servlet.http.HttpSession;
import com.ts.dao.SubcategoryDAO;
import com.ts.dto.Subcategory;
import com.ts.dto.Worker;

@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();		
		
		int catId =  Integer.parseInt(request.getParameter("catId"));
		//System.out.println(catId);
		
		SubcategoryDAO subcategoryDAO = new SubcategoryDAO();
		List<Subcategory> arrayList = subcategoryDAO.getAllSubcategorys(catId);
		request.setAttribute("subcategorysData",arrayList);
		RequestDispatcher rd = request.getRequestDispatcher("SelectServlet.jsp");
		rd.forward(request, response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}