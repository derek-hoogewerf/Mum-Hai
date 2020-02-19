<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<body>
<%
String name = request.getParameter("uname");
String pass = request.getParameter("pass");
Statement stmt = null;
String query = "select  UserName from  userLogin where c_uname='"+name+"' && c_pass='"+pass+"';";
try{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","root");
stmt = conn.createStatement();ResultSet row = stmt.executeQuery(query);
 if(row.next())
  out.println(row.getString("UserName")+" Welcome");
 else{out.println("Failed to Login!! :");
 out.print("Registration Failed!!  UserName or Password is incorrect");%>
  <jsp:include page="Login.html"></jsp:include>
<%
}
  }catch(Exception e){out.println(e);}
%>
 <a href="signup.jsp" >Not registered yet?...</a>
 <br/><BR/><br/>
 <a href="loging.jsp">Sign In as a Guide</a><br/>
 <a href="logind.jsp">Sign In as a Driver</a><br/>
 <a href="logina.jsp">Sign in Admin</a><br/>
    </body>
</html>
