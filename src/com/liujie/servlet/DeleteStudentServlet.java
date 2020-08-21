package com.liujie.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liujie.entity.Student;
import com.liujie.service.DeleteStudentService;
import com.liujie.serviceImp.DeleteStudentServiceImp;

/**
 * Servlet implementation class DeleteStudentServlet
 */
@WebServlet("/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteStudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		int id=Integer.parseInt(request.getParameter("id"));
		Student student = new Student(id);
		DeleteStudentService deleteStudentService = new DeleteStudentServiceImp();
		deleteStudentService.deleteStudent(student);
		request.getRequestDispatcher("/ShowStudentServlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * request.setCharacterEncoding("utf-8");
		 * response.setCharacterEncoding("utf-8"); response.setContentType("text/html");
		 * 
		 * Student student = new Student(); DeleteStudentService deleteStudentService =
		 * new DeleteStudentServiceImp(); deleteStudentService.deleteStudent(student);
		 * request.getRequestDispatcher("ShowStudent.jsp").forward(request, response);
		 */
	}

}
