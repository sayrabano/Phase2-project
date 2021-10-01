<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.Main.Search" %>
     
      <%@ page import="com.Main.UserDetails" %>

    
 
     <%@ page import="com.Main.UserDetails" %>



  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Gateway</title>


<%@include file="allcss.jsp" %>
	<link rel="stylesheet" href="CSS/style2.css" />
</head>
<body>
		<%@ include file="navbar.jsp" %>
						
						<div class="contain">
		<div class="raw ">
			<div class="col-md-4-ofset-md-4">
				<div class="card">
					<div class="card-header text-center c-head" id="head">
						<i class="fa fa-money" aria-hidden="true"></i>
						<h3>Payment</h3>
					</div>
					<div class="card-body">
						<form action="Payment" method="post">
						
							<div class="form-group">
								<label for="Accountno">Enter Account No</label> <input
									type="number"  name="Accountno" class="form-control" id="Accountno"  
									aria-describedby="usernamelHelp">
									
							</div>
							<div class="form-group">
								<label for="Accountholder">Enter Account Holder Name</label> <input
								
									type="text" name="Accountholder" class="form-control" id="Accountholder">
									
									 
							</div>
							<div class="form-group">
								<label for="cardno">Enter Card No</label> <input
								
									type="number" name="cardno" class="form-control" id="cardno">
									
									 
							</div>
							<div class="form-group">
								<label for="cvr">Enter CVR No</label> <input
								
									type="number" name="cvr" class="form-control" id="cvr">
									
									 </div><br>
									<p align="left"><span><strong>Total fare = <br> <%=UserDetails.ticket_price%> X <%=Search.persons%> persons = Rs.<%=UserDetails.ticket_price*Search.persons%></strong></span></p>
							
							<button type="submit" class="btn btn-primary btn-block badge--pill">Confirm Payment</button>
						</form>
						
					</div>
				</div>



			</div>



		</div>


	</div>



</body>
</html>