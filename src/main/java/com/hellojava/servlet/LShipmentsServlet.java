package com.hellojava.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hellojava.business.LShipments;
import com.hellojava.entity.Shipments;

public class LShipmentsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LShipments lis=new LShipments();
		List<Shipments> ship=new ArrayList();
		ship=lis.seekShipments();
		Map<String,Object> mapship=new HashMap();
		mapship.put("rows", ship);
		ObjectMapper obj=new ObjectMapper();
		String maps=obj.writeValueAsString(mapship);
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().println(maps);
		resp.getWriter().flush();
	}
	
}
