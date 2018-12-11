package com.hellojava.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hellojava.dbmanager.DBManager;
import com.hellojava.entity.Contract;

public class LContract extends DBManager{
	public List<Contract> seekContract() throws SQLException {
		List<Contract> contra=null;
		String sql="select *from worksite";
		Connection con=this.openConnection();
		Object [] parameter= {};
		ResultSet res=this.qurey((com.mysql.jdbc.Connection) con, sql, parameter);
		if(res.next()) {
			contra=new ArrayList();
			do {
				Contract cont=new Contract();
				cont.setId(res.getInt("id"));
				cont.setWo_site(res.getString("Wo_site"));
				cont.setCon_org(res.getString("Con_org"));
				cont.setPrice(res.getDouble("price"));
				cont.setAccount(res.getInt("account"));
				cont.setAddress(res.getString("address"));
				cont.setPeo_Name(res.getString("peo_Name"));
				cont.setIphone(res.getString("iphone"));
				cont.setSaleName(res.getString("saleName"));
				cont.setOrg(res.getString("org"));
				cont.setSaleNumber(res.getString("saleNumber"));
				cont.setLeader(res.getString("leader"));
//				int id;
//				String wo_site;
//				String con_org;
//				double price;
//				int account;
//				String address;
//				String peo_Name;
//				String iphone;
//				String saleName;
//				String org;
//				String saleNumber;
//				String leader;
				contra.add(cont);
				
			}while(res.next());
		}
		return contra;
	}
	public int addContract(Contract cont) throws SQLException {
		String sql="insert into worksite values(default,?,?,?,?,?,?,?,?,?,?,?)";
		int n;
		Connection conn=this.openConnection();
		Contract contr=cont;
		Object [] parameter= {contr.getWo_site(),contr.getCon_org(),contr.getPrice(),contr.getAccount(),contr.getAddress(),
			contr.getPeo_Name(),contr.getIphone(),contr.getSaleName(),contr.getOrg(),contr.getSaleNumber(),contr.getLeader()};
		n=this.excute((com.mysql.jdbc.Connection) conn, sql, parameter);
		return n;
	}
}
