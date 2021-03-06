package com.flyaway;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

  //Servlet for Logout
public class LogOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Creating HttpSession Object to Remove Attribute for Logout ...
		HttpSession session = request.getSession();
		session.removeAttribute("password");
		session.invalidate(); response.sendRedirect("Home.jsp");
		
		
	}

	

}
