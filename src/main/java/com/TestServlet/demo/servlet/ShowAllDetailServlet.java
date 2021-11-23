package com.TestServlet.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowAll")
public class ShowAllDetailServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String empId = (String) request.getAttribute("emptId");
		String ename = (String)request.getAttribute("fname");
		
		System.out.println("Servlet 2");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("Welcome to Servlet 2</br>");
		out.println("Employee Id : "+ empId); 
		out.println("</br>Name : "+ename);
		
	}
	


}
