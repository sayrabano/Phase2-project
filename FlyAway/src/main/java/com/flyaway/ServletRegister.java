package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




//Servlet for PassengerRegistration ....
public class ServletRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	

   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		//creating object for printWriter method ...
		
		PrintWriter out  = response.getWriter();
		response.setContentType("text/jsp");
		
	         //Getting Parameters...
			String first_name = request.getParameter("fname");
			String last_name = request.getParameter("lname");
			String email = request.getParameter("email");
			String mobile_no = request.getParameter("mobile");
			String address = request.getParameter("address");
			
			
			System.out.println(first_name+" "+ last_name+" "+mobile_no+" "+address);
		
		  //address Conditions...
		if(first_name.equals("")||last_name.equals("")||email.equals("")||mobile_no.equals("")||address.equals(""))
		{
			out.print("Please Enter valid  Passengers Details..");
		}
		else {
             response.sendRedirect("payment.jsp");
            
	      
		}
	
	} 
}

