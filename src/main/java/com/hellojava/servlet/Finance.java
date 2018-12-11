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
		String warehousing_timee=request.getParameter("warehousing_timee");//时间
		String limit[]=warehousing_timee.split("[/, ]");
		List<String> list=new ArrayList<>();
		list=Arrays.asList(limit);
		String number=((list.get(2)+"").substring(2))+"-"+(list.get(0)+"");
		System.out.println(number);
		String warehousing_id=request.getParameter("warehousing_id");//票据
		String supplierName=request.getParameter("supplierName");//发货
		String stuffName=request.getParameter("stuffName");//货物名称
		String carNumber=request.getParameter("carNumber");//车号
		String GW=request.getParameter("GW");//毛重
		String tare=request.getParameter("tare");//皮重
		String nw=request.getParameter("nw");//净重
		String driver_name=request.getParameter("driver_name");//司机
		String record_name=request.getParameter("record_name");//操作员
		Dispatcher dis=new Dispatcher();
		dis.setWarehousing_timee(warehousing_timee);
		String split[]=warehousing_id.split("-");
		dis.setWarehousing_id(warehousing_id);
		dis.setSupplierName(supplierName);
		dis.setStuffName(stuffName);
		dis.setCarNumber(carNumber);
		dis.setGW(GW);
		dis.setTare(tare);
		dis.setNw(nw);
		dis.setDriver_name(driver_name);
		dis.setRecord_name(record_name);
		Dpc dpc=new Dpc();
		boolean bool=dpc.execute(dis);
		response.getWriter().print(bool?1:2);
	}

}
