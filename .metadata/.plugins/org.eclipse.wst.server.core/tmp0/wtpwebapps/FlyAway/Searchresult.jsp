<%@page import="java.sql.*"%>
<%@ page import=" com.Main.Search" %>



<%
    String driverName = "com.mysql.jdbc.Driver";
    String Url = "jdbc:mysql://localhost:3306/flyaway";
 
    String userId = "root";
    String password = "say123";
    String query = Search.getQuery();
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
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Search Result</title>
   
<%@include file="allcss.jsp" %>
    <link rel="stylesheet" href="CSS/Style3.css" />
</head>

<body>

	<%@ include file="navbar.jsp" %>

<div class="container">
    <h2 align="center"><span><strong>Search Results</strong></span></h2>
    <p align="center">
        Showing Available Flights from <%=Search.origin%> to  <%=Search.destination%> <br>
        Date of travel : <%=Search.date%> (<%=Search.day%>)  <br>
        No of Passengers :  <%=Search.persons%>  <br>
    </p>
    <table class="table table-hover table-striped" id="tb">
        <thead class="thead">
        <tr>
           
            <th scope="col">Flight Name</th>
            <th scope="col">Origin</th>
            <th scope="col">Destination</th>
            <th scope="col">Date</th>
            <th scope="col">Ticket Price</th>
            <th scope="col">Choose</th>
        </tr>
        </thead>
        <tbody class="tbody">
        <br><p align="center"><span><strong>Book Flight</strong></span></p><br>
        <%
            try{
                connection = DriverManager.getConnection(Url, userId, password);
                statement=connection.createStatement();
                resultSet = statement.executeQuery(query);
                while(resultSet.next()){
        %>
        <tr>
            <td><%=resultSet.getString("Flight") %></td>
            <td><%=resultSet.getString("origin") %></td>
            <td><%=resultSet.getString("destination") %></td>
            
            
            <td><%=Search.date%></td>
            <td><%=resultSet.getString("ticket_price") %></td>
            <td>
                <form action="Register.jsp" method="post">
                    <input type="hidden" id="Flight" name="Flight" value="<%=resultSet.getString("Flight")%>">
                    <input type="hidden" id="ticket_price" name="ticket_price" value="<%=resultSet.getString("ticket_price")%>">
                    
                    <input type="submit" class="btn btn-primary btn-block badge--pill" value="Book Flight">
                </form>
            </td>
        </tr>
        <%
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
        </tbody>
    </table>
</div>

</body>
</html>