package com.gmail.aamedhin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//get request parameter
		String userName = request.getParameter("user_name");
		
		//set request attribute
		request.setAttribute("user_name", userName);
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}

}
