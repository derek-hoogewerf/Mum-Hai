import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Login extends HttpServlet {
//@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
PrintWriter z = response.getWriter();
String u = request.getParameter("");
String p = request.getParameter("");
if(u.equals("user") &amp;&amp; p.equals("password"))
{ response.sendRedirect("Home.jsp");}
else
{response.sendRedirect("security.jsp");}}}
