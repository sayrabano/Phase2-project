/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-09-28 17:55:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.flyaway.LogIn;

public final class adminDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/allcss.jsp", Long.valueOf(1632601024220L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.flyaway.LogIn");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>FlyAway</title>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("	\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Baloo+Bhai+2:wght@500&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Ubuntu:ital,wght@1,700&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\">");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/style7.css\" />\r\n");
      out.write("<style>\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-light bg-custom\" id=\"navbar\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<a class=\"navbar-brand\" id=\"tag\"><img src=\"Images/travel.png\" class=\"img-fluid\"  width=\"50px\">FlyAway Ticket Booking</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"Home.jsp\"> <i\r\n");
      out.write("						class=\"fa fa-home\" aria-hidden=\"true\"></i>Home\r\n");
      out.write("				</a></li>\r\n");
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("						<li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">\r\n");
      out.write("						<i class=\"fa fa-fighter-jet\"></i> Add Flight</a></li>\r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("						<li class=\"nav-item\"><a href=\"Changepassword.jsp\" class=\"nav-link\">\r\n");
      out.write("						<i class=\"fa fa-unlock-alt\" aria-hidden=\"true\"></i> Change Password</a></li>\r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</nav>\r\n");
      out.write("\r\n");
if(LogIn.isLoggedin) {


      out.write("\r\n");
      out.write("	<div>\r\n");
      out.write("		<h2>Welcome To Admin DashBoard</h2>\r\n");
      out.write("		<p style=\"text-align:center; font-size:15px; font-family:'Ubuntu', sans-serif;\"> LoggedIn as :- Username is : ");
      out.print(LogIn.username );
      out.write(" and\r\n");
      out.write("		Password is : ");
      out.print(LogIn.password );
      out.write(" \r\n");
      out.write("      </p>\r\n");
      out.write("		 \r\n");
      out.write("	<br><br>\r\n");
      out.write("	\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"row\" align=\"center\">\r\n");
      out.write("	<\r\n");
      out.write("        <div class=\"col-lg-3 col-md-4col-sm-6 mb-4\">\r\n");
      out.write("            <form action=\"LogOut\" method=\"get\">\r\n");
      out.write("           <button type=\"submit\" class=\"btn btn-primary btn\">Logout</button>\r\n");
      out.write("		</form>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("         <br><br><br><br>\r\n");
      out.write("               <center><h2>List of Flight</h2></center><br>\r\n");
      out.write("	\r\n");
      out.write("				<table class=\"table table-bodered table striped\" align=\"center\">\r\n");
      out.write("					<thead class=\"thead\">\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th scope=\"col\">Flight ID</th>\r\n");
      out.write("							<th scope=\"col\">Flight Name</th>\r\n");
      out.write("							<th scope=\"col\">Origin</th>\r\n");
      out.write("							<th scope=\"col\">Destination</th>\r\n");
      out.write("							<th scope=\"col\">Date</th>\r\n");
      out.write("							<th scope=\"col\">Day</th>\r\n");
      out.write("							<th scope=\"col\">Ticket Price</th>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</thead>\r\n");
      out.write("					<tbody class=\"tbody\">\r\n");
      out.write("\r\n");
      out.write("						\r\n");
      out.write("						");

						try {
							connection = DriverManager.getConnection(Url, userId, password);
							statement = connection.createStatement();
							String sql = "SELECT * FROM flight_list";
							resultSet = statement.executeQuery(sql);
							while (resultSet.next()) {
						
      out.write("\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td>");
      out.print(resultSet.getString("Id"));
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(resultSet.getString("Flight"));
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(resultSet.getString("Origin"));
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(resultSet.getString("Destination"));
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(resultSet.getString("Day"));
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(resultSet.getString("Date"));
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(resultSet.getString("Ticket_Price"));
      out.write("</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						");

						}
						} catch (Exception e) {
						e.printStackTrace();
						}
}

else{
	out.print("<h3>You should login First!</h3>");
}
						
      out.write("\r\n");
      out.write("					</tbody>\r\n");
      out.write("				</table>\r\n");
      out.write("		\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
