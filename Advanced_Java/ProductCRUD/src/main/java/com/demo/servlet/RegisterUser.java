package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

public class RegisterUser extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname=request.getParameter("uname");
		
		String email=request.getParameter("email");
		String role=request.getParameter("role");
		
		String pass=request.getParameter("pass");
		//create new user 
		MyUser newUser = new MyUser(uname, email, role,pass);
		LoginService lservice = new LoginServiceImpl();
		
		boolean status =lservice.addUser(uname,email,role, pass);
		
		if(status) {
			out.print("<h2>User Added Successfully!</h2>");
			RequestDispatcher rd= request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}else {
			out.print("<h2>User Not Added</h2>");
			RequestDispatcher rd= request.getRequestDispatcher("register.html");
			
		}
		
	}

}
