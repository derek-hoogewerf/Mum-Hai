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
        String n = request.getParameter("name");
        String u = request.getParameter("username"); 
        String e=request.getParameter("email");
        String p = request.getParameter("password");
        String ph= request.getParameter("phoneno");
        //String c = request.getParameter("country");
        String l = request.getParameter("language");
       String n = request.getParameter("natyionaity");
       String dob=request.getParameter("dob");
       String g=request.getParameter("gender");
       
       PrintWriter out = response.getWriter();
        try{
        Class.forName("com.mysql.jdbc.Driver");
         Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "root");
         PreparedStatement s = (PreparedStatement) con.prepareStatement("insert c_uname,c_pass,c_email,c_num,c_language,c_nationality,c_dob,c_gender into customer values (?, ?, ?, ?,?,?,?)");
            s.setString(1, u);
            s.setString(2, p);
            s.setString(3, n);
            s.setSTring(4, e);
            s.setString(5 ph);
            s.setString(6,l);
            s.setString(7, n);
            s.setString(8, dob);
            s.setString(9, g);
             
           out.println("Inserted");
        
        }
        catch(Exception ex)
        {
            out.println("Fail"); }}}
