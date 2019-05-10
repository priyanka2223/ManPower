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

import com.ts.dao.WorkerDAO;
import com.ts.dto.Worker;

@WebServlet("/DisplayWorkerProfile")
public class DisplayWorkerProfile extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		int workId = (Integer)session.getAttribute("workId");
		
		
		WorkerDAO workerDAO = new WorkerDAO();
		Worker worker = workerDAO.getWorker(workId);
		request.setAttribute("workerData", worker);
		
		RequestDispatcher rd = request.getRequestDispatcher("DisplayWorkerProflie.jsp");
		rd.include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
