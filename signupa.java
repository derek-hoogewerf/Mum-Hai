import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MyDB extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String id=request.getParameter("id");
        String u=request.getParameter("u");
        String n = request.getParameter("n");
        String p = request.getParameter("p");
        String e = request.getParameter("e");
        String c = request.getParameter("num");
        PrintWriter out = response.getWriter();
        try{
        Class.forName("com.mysql.jdbc.Driver");
         Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "root");
         PreparedStatement s = (PreparedStatement) con.prepareStatement("insert into info values (?, ?, ?, ?)");
         s.setString(1, id);
         s.setString(2, u);
            s.setString(3, p);
            s.setString(4, n);
            s.setString(3, e);
            s.setString(4, e);
            s.setString(5.num);
           out.println("Inserted");
        
        }
        catch(Exception ex)
        {
            out.println("Fail"); }}}
