package com.task;


import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class saveUrl extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	
	
	//System.out.println(req.getParameter("urlname"));
	resp.sendRedirect(req.getParameter("urlname"));
	
	
	
}
}
