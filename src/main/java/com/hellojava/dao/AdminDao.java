package com.hellojava.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hellojava.dbmanager.DBManager;
import com.hellojava.entity.Admin;

public class AdminDao extends DBManager {
	
	public Admin query(Admin admin) throws SQLException {
		Admin ads=null;
		Connection con=this.openConnection();
		String sql="select * from admin where User=? and Password=password(?)";
		Object ob[]= {admin.getUserName(),admin.getUserPass()};
		ResultSet result=this.qurey((com.mysql.jdbc.Connection) con, sql, ob);
		if(result.next()) {
			ads=new Admin();
			ads.setUserName(result.getString("User"));
			ads.setUserPass(result.getString("Password"));
		}
		return ads;
	}
}
