package servlet;

import db.DbConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

@WebServlet(name = "DisplayServlet")
public class DisplayServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><body>");
        try
        {
            DbConnection dbConnection;
            dbConnection = new DbConnection();
            ResultSet rs = dbConnection.getRecords();
            out.println("Data will be displayed here");
            out.println("<table border=1 width=50% height=50%>");
            out.println("<tr> <th>ID</th><th>First Name</th><th>Last Name</th> <th>Gender</th><th>City</th><th>Country</th></tr>");
            while (rs.next())
            {
                String username = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String gender = rs.getString("gender");
                String city = rs.getString("city");
                String country = rs.getString("country");

                int id = rs.getInt("Id");
                out.println("<tr><td>" + id + "</td><td>" + username +"</td><td>" + lastname +"</td><td>" + gender +"</td><td>" + city +"</td><td>" + country +"</td></tr>");
            }
            out.println("</table>");
            out.println("</body></html>");
        }
        catch (Exception e)
        {
            out.println("error");
        }
    }
}
