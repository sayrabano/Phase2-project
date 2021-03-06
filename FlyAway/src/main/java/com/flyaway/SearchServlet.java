package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Main.Search;

 // SearchServlet ...
public class SearchServlet extends HttpServlet {
	
    
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		      //Fetching parameters for Searching  data...
		        Search.date = req.getParameter("date");
		        Search.origin = req.getParameter("source");
		        Search.destination = req.getParameter("destination");
		        Search.persons = Integer.parseInt(req.getParameter("persons"));
		        
		        
            //Conditions for Getting data from Database Table;
		        if (Search.date.equals("")) {
		            PrintWriter out = resp.getWriter();
		            out.println("<h1 >Date can not be Empty ! choose valid option|</h1>");
		        }
		        else {
		            Search.day = getDay(Search.date);
		            resp.sendRedirect("Searchresult.jsp");
		        }
		    }
             
	          
	          
	   
	     // Declaring Date method...
		    public String getDay(String dateInp) {
		        LocalDate dt = LocalDate.parse(dateInp);
		        return dt.getDayOfWeek().toString();
		    }
	

}  
       


