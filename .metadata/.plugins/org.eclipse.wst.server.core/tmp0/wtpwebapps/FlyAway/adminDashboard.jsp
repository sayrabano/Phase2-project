<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import=" com.flyaway.LogIn"%>

<%
String driverName = "com.mysql.cj.jdbc.Driver";
String Url = "jdbc:mysql://localhost:3306/flyaway";
String userId = "root";
String password = "say123";
try {
	Class.forName(driverName);
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
<%@include file="allcss.jsp" %>
<link rel="stylesheet" href="CSS/style7.css" />
<style>
</style>
</head>

<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-custom" id="navbar">





		<a class="navbar-brand" id="tag"><img src="Images/travel.png" class="img-fluid"  width="50px">FlyAway Ticket Booking</a>


		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="Home.jsp"> <i
						class="fa fa-home" aria-hidden="true"></i>Home
				</a></li>

				
				
					
						
						
						<li class="nav-item"><a href="Changepassword.jsp" class="nav-link">
						<i class="fa fa-unlock-alt" aria-hidden="true"></i> Change Password</a></li>
						
						



			</ul>



		</div>

	</nav>

<%if(LogIn.isLoggedin) {
%>
	<div>
		<h2>Welcome To Admin DashBoard</h2>
		<p style="text-align:center; font-size:15px; font-family:'Ubuntu', sans-serif;"> LoggedIn as :- Username is : <%=LogIn.username %> and
		Password is : <%=LogIn.password %> 
      </p>
		 
	<br><br>
	
	</div>
	<div class="row" align="center">
	
        <div class="col-lg-3 col-md-4col-sm-6 mb-4">
            <form action="LogOut" method="get">
           <button type="submit" class="btn btn-primary btn">Logout</button>
		</form>
        </div>
        
        </div>
        
         <br><br><br><br>
               <h2 style="text-align:center;">List of Flight</h2><br>
	
				<table class="table table-bodered table striped" align="center">
					<thead class="thead">
						<tr>
							<th scope="col">Flight ID</th>
							<th scope="col">Flight Name</th>
							<th scope="col">Origin</th>
							<th scope="col">Destination</th>
							<th scope="col">Date</th>
							<th scope="col">Day</th>
							<th scope="col">Ticket Price</th>
						</tr>
					</thead>
					<tbody class="tbody">

						
						<%
						try {
							connection = DriverManager.getConnection(Url, userId, password);
							statement = connection.createStatement();
							String sql = "SELECT * FROM flight_list";
							resultSet = statement.executeQuery(sql);
							while (resultSet.next()) {
						%>
						<tr>
							<td><%=resultSet.getString("Id")%></td>
							<td><%=resultSet.getString("Flight")%></td>
							<td><%=resultSet.getString("Origin")%></td>
							<td><%=resultSet.getString("Destination")%></td>
							<td><%=resultSet.getString("Day")%></td>
							<td><%=resultSet.getString("Date")%></td>
							<td><%=resultSet.getString("Ticket_Price")%></td>
						</tr>
						<%
						}
						} catch (Exception e) {
						e.printStackTrace();
						}
}
else{
	out.print("<h3>You should login First!</h3>");
}
						%>
					</tbody>
				</table>
		
</body>
</html>