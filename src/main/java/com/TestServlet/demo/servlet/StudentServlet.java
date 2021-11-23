package com.TestServlet.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "studentServlet", description = "Example Servlet Using Annotations", urlPatterns = { "/student" })
public class StudentServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String sname = request.getParameter("sname");

		response.setContentType("html/text");
		System.out.println("in student servlet : "+sname);
		PrintWriter out = response.getWriter();

		out.print(sname);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String sname = request.getParameter("sname");

		response.setContentType("html/text");
		System.out.println("in student servlet : "+sname);
		PrintWriter out = response.getWriter();

		out.print(sname);
	}
}
