package com.TestServlet.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AnnotationExample", description = "Example Servlet Using Annotations", urlPatterns = { "/emp" })
public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String empId = request.getParameter("empId");
		String fname = request.getParameter("fname");
		String password = request.getParameter("password");

//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		

//		out.println("<p>Hello World!</p>");
//		out.println("fname : "+fname);
//		out.println("empId : "+empId);

		System.out.println("in servlet1");
//
		request.setAttribute("fname", fname);
		request.setAttribute("emptId", empId);

		RequestDispatcher rs = request.getRequestDispatcher("ShowAll");
		rs.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		String name = request.getParameter("fname");

		System.out.println("in post method***");
//		response.setContentType("text/html");
		response.setContentType("application/json");		    

		PrintWriter out = response.getWriter();

		out.print(name);
	}
	


}
