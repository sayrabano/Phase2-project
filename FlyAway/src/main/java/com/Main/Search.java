package com.Main;

public abstract class Search {
	  public static String date;
	    public static String day;
	    public static String origin;
	    public static String destination;
	    
	    public static int persons;

	    public static String getQuery() {
	        return "SELECT * FROM flight_list WHERE  Origin = '"+origin+"' AND Destination='"+destination+"' AND day='"+day+"'";
	    }
	

}
