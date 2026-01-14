package com.demoProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(name,password);
		HttpSession session  = request.getSession();
	
		
			try {
				DAO dao = new DAO();
				if(dao.validate_user(user))
				{
					session.setAttribute("loggedUser", user);
					response.sendRedirect("welcome.jsp");
					
					
				}
				else
				{
					response.sendRedirect("login.jsp");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		
		
	}

}
