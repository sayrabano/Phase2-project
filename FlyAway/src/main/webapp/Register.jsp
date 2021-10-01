<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.Main.UserDetails" %>

<%
  
    UserDetails.ticket_price = Integer.parseInt(request.getParameter("ticket_price"));
    UserDetails.Flight_name = request.getParameter("Flight");
   
%> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<%@include file="allcss.jsp" %>
	<link rel="stylesheet" href="CSS/Style6.css" />
	<style>
	
	</style>
</head>

<body>

		<%@ include file="navbar.jsp" %>
<div>


</div>
<div class="wrapper">
  <div class="title">
    Register Here
  </div>
  
  
<form action="ServletRegister" method="post">
  
  <div class="form">
    <div class="input_field">
      <input type="text" name="fname" placeholder="Enter First Name" class="input">
      <i class="fa fa-user" aria-hidden="true"></i>
     
    </div>
    <div class="input_field">
    
      <input type="text" name="lname" placeholder="Enter Last Name" class="input">
      <i class="fa fa-user" aria-hidden="true"></i>
      
    </div>
    <div class="input_field">
      <input type="email" name="email" placeholder="Email" class="input">
      <i class="fa fa-envelope" aria-hidden="true"></i>
      
    </div>
    <div class="input_field">
     
      <input type="text" name ="mobile" placeholder="Enter Mobile No" class="input">
      <i class="fa fa-mobile" aria-hidden="true"></i>
    </div>
        <div class="input_field">
      <input type="text" name="address" placeholder="Address" class="input">
     <i class="fa fa-address-card" aria-hidden="true"></i>
    </div><br>
  <button type="submit" class="btn btn-primary btn-block badge--pill">Register</button>
  
    </form>
  </div>



</body>
</html>