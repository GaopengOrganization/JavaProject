package com.hellojava.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hellojava.business.Check;
import com.hellojava.entity.Admin;

@WebServlet(value= {"/loginservlet"})
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String userName=request.getParameter("userName");
		String userPass=request.getParameter("userPass");
		if(userName!=""||userPass!="") {
			Admin admin=new Admin();
			admin.setUserName(userName);
			admin.setUserPass(userPass);
			Check check=new Check();
			boolean bool=check.query(admin);
			response.getWriter().print(bool?0:1);
		
		}
	}
}