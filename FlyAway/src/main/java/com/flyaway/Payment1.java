package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 //Servlet for PaymentMode..
public class Payment1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//creating object for printWriter method ...
		PrintWriter out = response.getWriter();
		
		 //Fetching parameters
		String Accountno = request.getParameter("Accountno");
		String Accountholder = request.getParameter("Accountholder");
		String cardno = request.getParameter("cardno");
		String cvr = request.getParameter("cvr");
		
		
		//Declaring Coditions....
		
		if(Accountno.equals("")||Accountholder.equals("")|cardno.equals("")||cvr.equals("")) {
			out.println("Please Fill Payment Details First!");
			RequestDispatcher rd = request.getRequestDispatcher("Thankyou.jsp");
			
			
		}
		else {
			response.sendRedirect("Thankyou.jsp");
		}
		
		out.close();
		
	}

	


}
