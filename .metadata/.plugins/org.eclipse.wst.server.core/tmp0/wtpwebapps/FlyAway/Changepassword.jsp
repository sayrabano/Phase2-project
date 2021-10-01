<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="com.flyaway.LogIn"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
<%@include file="allcss.jsp" %>
<link rel="stylesheet" href="CSS/style9.css" />


</head>
<body>

		<%@ include file="navbar.jsp" %>



	<div class="contain">
		<div class="raw -">
			<div class="col-md-4-oofset-md-4">
				<div class="card">
					<div class="card-header text-center c-head" id="head">
						
						<h2>CHANGE PASSWORD</h2>
						<%if (LogIn.isLoggedin)
						{ 
						%>
						<i class="fa fa-unlock-alt" aria-hidden="true"></i>
					</div>
					<div class="card-body">
						<form action="Changepassword" method="post">
						
						
							<div class="form-group">
								<label for="newpass">Enter New Password</label> <input
									type="password"  name="user_password" class="form-control" id="newpass"
									aria-describedby="passwordHelp"> <br><br>
									
						
							
							<button type="submit" class="btn btn-primary btn-block badge--pill">Change Password</button>
						</form>
						<%
						}
						else{
							out.println("<h2>You have to login First!</h2>");
						}
						%>
					</div>
				</div>

                     
			</div>



		</div>


	</div>

                   




</body>

</html>