package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 //AdminLogin Servlet....
public class LogIn extends HttpServlet {
	//Initializing or Declaring Variables for Admin log in Page...
	private static final long serialVersionUID = 1L;
	public static  String username = "Admin";
	public static  String password = "1234";
	public static boolean isLoggedin = false;
	
	 

	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 //creating object for printWriter method ...
		
		PrintWriter out = response.getWriter();
		//out.println("hello welcome");
		
		
		
		 //Fetching parameters
		String username = request.getParameter("user_name");
		String password = request.getParameter("user_password");

		
		//Declaring Condition for Login Validation .....
		if (username.equals(LogIn.username) && password.equals(LogIn.password)) {

		   isLoggedin = true;

		   HttpSession session = request.getSession();
		   request.setAttribute("password", password);
			response.sendRedirect("adminDashboard.jsp");
			System.out.println("You have LoggedIn");
		}

		else {
			isLoggedin = false;
			out.println("You have Entered Wrong username or password ! Try  Again");
		}
		//Closing out method
		out.close();

	}


	
 
}
