<%@page import="com.flyaway.LogIn" %>


<html lang="en">
<head>

<title>Login</title>

<%@include file="allcss.jsp" %>
<link rel="stylesheet" href="CSS/Style4.css" />
<%@ include file="navbar.jsp" %>

</head>
<body>





	<div class="contain">
		<div class="raw -">
			<div class="col-md-4-oofset-md-4">
				<div class="card">
					<div class="card-header text-center c-head" id="head">
						<i class="fa fa-user-circle-o fa-2x"></i>
						<h3>Admin</h3>
					</div>
					<div class="card-body">
						<form action="login" method="post">
						
							<div class="form-group">
								<label for="exampleInputusername">Enter User Name</label> <input
									type="text"  name="user_name" class="form-control" id="exampleInputusername"  
									aria-describedby="usernamelHelp">
									<span>Current Username : <%=LogIn.username %></span><br><br>
									
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Enter Password</label> <input
								
									type="password" name="user_password" class="form-control" id="exampleInputPassword1">
									<span>Current Password : <%=LogIn.password %></span><br>
									
									 
							</div>
							
							<button type="submit" class="btn btn-primary btn-block badge--pill">Sign In</button>
						</form>
						
					</div>
				</div>



			</div>



		</div>


	</div>






	
	
	
</body>

</html>