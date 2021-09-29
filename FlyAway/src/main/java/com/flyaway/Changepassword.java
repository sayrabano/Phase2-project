package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

   //Servlet for ChangePassword Field.....
public class Changepassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //creating object for printWriter method ...
		
		PrintWriter out = response.getWriter();
		  //Getting parameter for password field
		
		String newpass= request.getParameter("user_password");
	
		
		  
		//Declaring Condition to Validate NewPassword .....
		
	         if (newpass.equals("")){
	            out.println("Password can't be empty");
	        }
	        else if (LogIn.isLoggedin && !newpass.equals("")){
	            LogIn.password = newpass;
	         
	          
	           
	            out.println("Password has been changed Successfully. New Password is "+LogIn.password);
	        }
	        else {
	            out.println("Oops, Something went wrong ! Try again");
	        }
	         //Closing out method
	        out.close();
	    }
		
		
		
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}
	
        
		
	}
	


