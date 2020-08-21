package com.liujie.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liujie.entity.Student;
import com.liujie.service.AddStudentService;
import com.liujie.serviceImp.AddStudentServiceImp;

/**
 * Servlet implementation class AddCityServlet
 */
@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddStudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		Student student=new Student(name,account,password);
		AddStudentService addStudentService = new AddStudentServiceImp();
		addStudentService.addStudent(student);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ShowStudentServlet");
		requestDispatcher.forward(request, response);
	}

}
