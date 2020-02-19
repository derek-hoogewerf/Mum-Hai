<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<body>
<%
String name = request.getParameter("uname");
String pass = request.getParameter("pass");
Statement stmt = null;
String query = "select  UserName from  driver where UserName='"+name+"' && password='"+pass+"';";
try{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MUMHAI","root","root");
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
    </body>
</html>
