package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.ProductService;
import com.demo.service.ProductserviceImpl;

public class DeleteProduct extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("pid"));
		ProductService pservice=new ProductserviceImpl();
		boolean status=pservice.deleteById(pid);
		RequestDispatcher rd=request.getRequestDispatcher("showproduct");
		rd.forward(request, response);
	}

}
