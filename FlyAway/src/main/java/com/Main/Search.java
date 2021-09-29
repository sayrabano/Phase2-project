package com.Main;

public abstract class Search {
	
	  //Search Abstract class...
	
	   // initializing Variables...
	
	    public static String date;
	    public static String day;
	    public static String origin;
	    public static String destination;
	   public static int persons;

	   
	    //Creating SqlQuery to Fetch Data....
	    public static String getQuery() {
	        return "SELECT * FROM flight_list WHERE  Origin = '"+origin+"' AND Destination='"+destination+"' AND day='"+day+"'";
	    }
	

}
