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
public class NameFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("fname");
		
		System.out.println("filter name length "+name.length());
		if(name.length()<3)
			out.print("Name should be more than 3 charcter");
		else
			chain.doFilter(request, response);
		
		
	}

}
