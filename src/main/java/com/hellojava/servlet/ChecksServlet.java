package com.hellojava.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
@WebServlet(value= {"/checksServlet"})
public class ChecksServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String warehousing_timee=request.getParameter("warehousing_timee");
		String limit[]=warehousing_timee.split("[/, ]");
		List<String> list=new ArrayList<>();
		list=Arrays.asList(limit);
		String number=((list.get(2)+"").substring(2))+"-"+((list.get(0)+"-")+"");
		ObjectMapper objectMapper=new ObjectMapper();
		String numbers=objectMapper.writeValueAsString(number);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(numbers);
		response.getWriter().flush();
	}

}
