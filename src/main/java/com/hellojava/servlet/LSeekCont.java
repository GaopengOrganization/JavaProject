package com.hellojava.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hellojava.business.LCon;
import com.hellojava.entity.Contract;

public class LSeekCont extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LCon seek=new LCon();
		List<Contract> sek=seek.seek();
		Map<String,Object> list=new HashMap<>();
		list.put("rows", sek);
		ObjectMapper obj=new ObjectMapper();
		String jsonStr=obj.writeValueAsString(list);
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().print(jsonStr);
		resp.getWriter().flush();
	}
	
}
