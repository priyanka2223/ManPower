package com.ts.web;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.WorkerDAO;
import com.ts.dto.Worker;

@WebServlet("/ChangeStatus")
public class ChangeStatus extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int workId = Integer.parseInt(request.getParameter("workId"));
		int statusId = Integer.parseInt(request.getParameter("statusId"));

		WorkerDAO workerDAO = new WorkerDAO(); 
		
		String status;
		if(statusId==1)
			status="Yes";
		else
			status="No";
		int x = workerDAO.updateStatus(workId,status);

		RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp");
			rd.include(request, response);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
