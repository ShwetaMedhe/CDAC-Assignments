package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;


public class ForgotPassword extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String newPass=request.getParameter("pass");
		
		LoginService lservice=new LoginServiceImpl();
		boolean updated=lservice.updatePassword(uname,newPass);
		
		if(updated) {
			out.print("<h2>Password updated sucessfull</h2>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		} else {
			out.print("<h2>User not found</h2>");
			RequestDispatcher rd=request.getRequestDispatcher("forgotpassword.html");
			rd.include(request, response);
		}
		
		
	}

}
