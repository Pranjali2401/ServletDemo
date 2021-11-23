package com.TestServlet.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/emp")
public class IdFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		int empId = Integer.parseInt(request.getParameter("empId"));
		System.out.println("in filter : "+empId);
		
		if(empId>1)
		chain.doFilter(request, response);
		else
			out.print("Id is invalid");
	}
	

}
