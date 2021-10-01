<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@ page import="com.Main.Search"%>
<%@page import="java.util.Date" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Confirmation</title>

<%@ page import="com.Main.UserDetails"%>
<%@include file="allcss.jsp"%>
<link rel="stylesheet" href="CSS/style8.css" />

</head>
<body>


	<%@ include file="navbar.jsp"%>


	<div class="container">
		<h2 align="center">
			<span><strong>Thank You</strong></span>
		</h2>
		<div align="center" class="col">
			<img src="Images/travel.png" style="max-width: 90px;"
				class="img-fluid" alt="image">


		</div>
		<p align="center">
			<span><strong>Your Ticket has been booked. The
					Details of the Flight are Belows</strong></span>
		</p>
		<p style="text-align:center;">Date of Ticket Booking : <%=new Date().toString() %></p>
		<br>


		<div class="cont">

			<div class="div">
				<h3 style="text-align: center;">
					<img src="Images/airplane.png" style="max-width: 30px;"
						class="img-fluid" alt="image">&nbsp &nbsp FlyAway
				</h3>


			</div>

			<p class="p">
				Date of Departure :
				<%=Search.date%>
				(<%=Search.day%>)
			</p>
			<div>
				<h3 style="text-align: center; margin-top: 15px;">
					Name of Flight :
					<%=UserDetails.Flight_name%></h3>

			</div>
			<div class="origin">
				<h2>
					From : &nbsp<%=Search.origin%></h2>
			</div>
			<div class="dest">
				<h2>
					Destination :
					<%=Search.destination%>
				</h2>
			</div>
			<div>
				<p>
					Number of Passenger :
					<%=Search.persons%>
				</p>
			</div>
			
		</div>

		<h2 align="right">
			<strong>Total Paid- Rs.<%=Search.persons * UserDetails.ticket_price%></strong>
		</h2>
		


		<p>
			<button onclick="window.print()" class="btn btn-success ">Print
				Ticket</button>
		</p>

	</div>

</body>
</html>