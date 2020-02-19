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
        //String id=NULL;
        String u=request.getParameter("username");
        String n = request.getParameter("name");
        String p = request.getParameter("password");
        String e = request.getParameter("email");
        String num = request.getParameter("phone");
        String l=request.getParameter("lang");
       
        PrintWriter out = response.getWriter();
        try{
        Class.forName("com.mysql.jdbc.Driver");
         Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/MUMHAI", "root", "root"); //set db connection
         PreparedStatement s = (PreparedStatement) con.prepareStatement("insert d_uname,d_pass,d_name,d_pass,d_num,d_lang,d_lic,v_id  guide info values (?, ?, ?, ?, ?, ?, ?, ?)");
        
            s.setString(1, u);
            s.setString(2, p);
            s.setString(3, n);
            s.setString(4, e);
            s.setString(5 num);
            s.setString(6, lang);
            //s.setString(7, lic);
           // se.setString(8,reg);
           out.println("Inserted");
        
        }
        catch(Exception ex)
        {
            out.println("Fail"); 
        }
     }
}
