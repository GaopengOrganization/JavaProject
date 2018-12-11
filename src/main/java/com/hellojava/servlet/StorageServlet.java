package com.hellojava.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hellojava.business.StoragesCheck;
import com.hellojava.entity.Storages;

@WebServlet(value= {"/storageServlet"})
public class StorageServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String datetimes=request.getParameter("datetimes");
		String sandHead=request.getParameter("sandHead");
		String waste=request.getParameter("waste");
		String cement=request.getParameter("cement");
		String rawSand=request.getParameter("rawSand");
		String coal=request.getParameter("coal");
		String additiveA=request.getParameter("additiveA");
		String additiveB=request.getParameter("additiveB");
		String yieldSand=request.getParameter("yieldSand");
		String people=request.getParameter("people");
		Storages storages=new Storages();
		storages.setDatetimes(datetimes);
		storages.setSandHead(sandHead);
		storages.setWaste(waste);
		storages.setCement(cement);
		storages.setRawSand(rawSand);
		storages.setCoal(coal);
		storages.setAdditiveA(additiveA);
		storages.setAdditiveB(additiveB);
		storages.setYieldSand(yieldSand);
		storages.setPeople(people);
		StoragesCheck storagesCheck=new StoragesCheck();
		boolean bool=storagesCheck.execute(storages);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(bool?1:2);
		
	}

}
