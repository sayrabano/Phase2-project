package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class ServletRegister
 */
public class ServletRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	

   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		PrintWriter out  = response.getWriter();
		response.setContentType("text/jsp");
		
	
			String first_name = request.getParameter("fname");
			String last_name = request.getParameter("lname");
			String email = request.getParameter("email");
			String mobile_no = request.getParameter("mobile");
			String address = request.getParameter("address");
			
			
			
		
		
		if(first_name.equals("")||last_name.equals("")||email.equals("")||mobile_no.equals("")||address.equals(""))
		{
			out.print("Please Enter valid  Passengers Details..");
		}
		else {
             response.sendRedirect("payment.jsp");
            
	      
		}
	}
}
