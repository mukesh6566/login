package com.otonomis.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.otonomis.validate.LoginValidation;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
		   String email=request.getParameter("email");
		   String pass=request.getParameter("pass");
			HttpSession session=request.getSession();
		   PrintWriter out=response.getWriter();
		    if(email.equals(""))
		    {
			  out.print("Please enter email");
		    }
		    if(pass.equals(""))
		    {
		    	out.print("please enter your password");
		    }
		    if(LoginValidation.validateEmail(email)==true)
		    {
		    	if(email.equals("mk@gmail.com")&&pass.equals("123"))
		    	{
		    		session.setAttribute("pass",pass);
		    		response.sendRedirect("loginsucess.jsp");
		    	}
		    	else
		    	{
		    		response.sendRedirect("loginfailed.jsp");
		    	}
		    }
		    else
		    {
		    	out.print("please enter Valid email format");
		    }
		  
	
	}

}
