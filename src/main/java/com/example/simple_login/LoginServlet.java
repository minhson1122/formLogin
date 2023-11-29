package com.example.simple_login;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String username = request.getParameter("username");
        String passwold = request.getParameter("passwold");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if("admin".equals(username) && "admin".equals(passwold)){
            writer.println("<h1>Welcome" + username + " to website</h1>");
        }else {
            writer.println("<h1>login Error</h1>");
        }
        writer.println("</html>");
    }
}
