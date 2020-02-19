import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Name extends HttpServlet
{protected void doPost(HttpServletRequest x, HttpServletResponse y) throws ServletException, IOException
    {String n = x.getParameter("n");String p = x.getParameter("p");
        PrintWriter pr = y.getWriter();
//if(p.equals(“root”))
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb","root","123456");
stmt = conn.createStatement();ResultSet row = stmt.executeQuery(query);
 if(row.next())
{x.getRequestDispatcher("/index.html").include(x, y);pr.println("Welcome, "+n);
}
else
{ x.getRequestDispatcher("/index.html").include(x, y); 
pr.println("<font color = red>you have entered incorrect password</font>”);}}}
