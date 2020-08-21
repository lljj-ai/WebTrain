package com.liujie.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liujie.entity.City;
import com.liujie.service.DisplayCityService;
import com.liujie.serviceImp.DisplayCityServiceImp;

/**
 * Servlet implementation class DisplayCityServlet
 */
@WebServlet("/ShowCityServlet")
public class ShowCityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCityServlet() {
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		DisplayCityService displayCityService=new DisplayCityServiceImp();
		List<City> city=displayCityService.displayCities();
		request.setAttribute("city", city);
		request.getRequestDispatcher("ShowCity.jsp").forward(request,response);
	}

}
