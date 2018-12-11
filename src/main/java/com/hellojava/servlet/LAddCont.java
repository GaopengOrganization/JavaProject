package com.hellojava.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hellojava.business.LCon;
import com.hellojava.entity.Contract;

public class LAddCont extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Contract cont=new Contract();
		LCon lcon=new LCon();
		Boolean bool=false;
		String wo_site=req.getParameter("wo_site");
		String con_org=req.getParameter("con_org");
//		System.out.println(req.getParameter("con_org"));
		double price=Double.parseDouble( req.getParameter("price"));
//		System.out.println(req.getParameter("price"));
		int account=Integer.parseInt( req.getParameter("account"));
		String address =req.getParameter("address");
		String peo_Name=req.getParameter("peo_Name");
		String iphone=req.getParameter("iphone");
		String saleName=req.getParameter("saleName");
		String org=req.getParameter("org");
		String saleNumber =req.getParameter("saleNumber");
		String leader =req.getParameter("leader");
		
		cont.setWo_site(wo_site);
		cont.setCon_org(con_org);
		cont.setPrice(price);
		cont.setAccount(account);
		cont.setAddress(address);
		cont.setPeo_Name(peo_Name);
		cont.setIphone(iphone);
		cont.setSaleName(saleName);
		cont.setOrg(org);
		cont.setSaleName(saleName);
		cont.setSaleNumber(saleNumber);
		cont.setLeader(leader);
		
		bool=lcon.add(cont);
		resp.getWriter().println(bool);
		resp.getWriter().flush();
	}
	
}
