package servlet;

import db.DbConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletData")
public class ServletData extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Servlet called");
        String firstname = request.getParameter("fName");
        System.out.println(firstname);
        String lastname = request.getParameter("lName");
        System.out.println(lastname);
        String gender = request.getParameter("gender");
        System.out.println(gender);
        String city = request.getParameter("city");
        System.out.println(city);
        String country = request.getParameter("country");
        System.out.println(country);
        System.out.println("visible");

        DbConnection db = new DbConnection();
        db.insertRecord(firstname,lastname,gender,city,country);
        System.out.println("Inserted");
        response.sendRedirect("display");
    }
}
