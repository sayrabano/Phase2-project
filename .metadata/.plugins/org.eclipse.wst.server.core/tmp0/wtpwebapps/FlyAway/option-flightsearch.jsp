<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import=" com.Main.Search" %>


<!DOCTYPE html>
<html lang="en">
<head>

<title>Welcome to FlyAway</title>



<%@include file="allcss.jsp" %>

<link rel="stylesheet" href="CSS/Style5.css" />
</head>
<body>
	<%@ include file="navbar.jsp" %>





	<section class="col-md-6 col-md-4" id="form">
		<form action="SearchServlet" class="form-container">
			
			<div class="form-group">
				<label for="source">Origin</label> <select class="form-control"
				
					id="source" name="source">
					
					<option value="India">India</option>
					<option value="USA">USA</option>
					<option value="UK">UK</option>
					<option value="Dubai">Dubai</option>
					
				</select>
			</div>
			<div class="form-group">
				<label for="destination">Destination</label> <select
					class="form-control" id="destination" name="destination">
					<option value="UK">UK</option>
					<option value="USA">USA</option>
					<option value="Dubai">Dubai</option>
					<option value="India">India</option>


				</select>
			</div>
			<div>
				<label for="persons">No of Persons</label> <select
					class="form-control" id="persons" name="persons">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
			</div>
			<div class="form-group">
				<label for="date">Date</label> <input type="date"
					class="form-control" id="date" name="date">
			</div>
			<br>
			<button type="submit" class="btn btn-primary btn-block badge--pill">Search Flight</button>
		</form>
	</section>




</body>
</html>