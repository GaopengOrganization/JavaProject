package com.hellojava.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hellojava.business.Dpc;
import com.hellojava.entity.Dispatcher;

@WebServlet(value= {"/finance"})
public class Finance extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String warehousing_timee=request.getParameter("inTime");
		String warehousing_id=request.getParameter("serialNumber");
		String supplierName=request.getParameter("supplier");
		String stuffName=request.getParameter("materials");
		String carNumber=request.getParameter("carNumber");
		String GW=request.getParameter("gross");
		String tare=request.getParameter("tare");
		String nw=request.getParameter("suttle");
		String driver_name=request.getParameter("chauffeur");
		String record_name=request.getParameter("arrange");
		Dispatcher dis=new Dispatcher();
		dis.setWarehousing_timee(warehousing_timee);
		dis.setWarehousing_id(warehousing_id);
		dis.setSupplierName(supplierName);
		dis.setStuffName(stuffName);
		dis.setCarNumber(carNumber);
		dis.setGW(Double.parseDouble(GW));
		dis.setTare(Double.parseDouble(tare));
		dis.setNw(Double.parseDouble(nw));
		dis.setDriver_name(driver_name);
		dis.setRecord_name(record_name);
		Dpc dpc=new Dpc();
		boolean bool=dpc.execute(dis);
		response.getWriter().print(bool?1:2);
	}

}
