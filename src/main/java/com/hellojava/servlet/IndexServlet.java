package com.hellojava.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hellojava.business.Check;

@WebServlet(value= {"/indexServlet"})
public class IndexServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int page=Integer.parseInt(request.getParameter("page"));
		int pageSize=Integer.parseInt(request.getParameter("rows"));
		Check check=new Check();
		List list=check.querys(page-1, pageSize);
		Map<String, Object> map=new HashMap();
		map.put("total", 100);
		map.put("rows", list);
		ObjectMapper mapper=new ObjectMapper();
		String jsonStr=mapper.writeValueAsString(map);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(jsonStr);
		response.getWriter().flush();
	}

}
