package com.hellojava.dbmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public abstract class DBManager{
	static {
	String driver =DBManagerUtil.value("driver");
	try {
		Class.forName(driver);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	}
	public Connection openConnection() throws SQLException {
		Connection conn=null;
		String url=DBManagerUtil.value("url");
		String user=DBManagerUtil.value("username");
		String password=DBManagerUtil.value("password");
		conn=DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public void closeConnection(Connection conn) throws SQLException {
		if(conn!=null) {
		conn.close();
		}
	}
	
	public int excute(Connection conn,String sql,Object...objects) throws SQLException {
		int ret=0;
		PreparedStatement sta=conn.prepareStatement(sql);
		for(int i=0;i < objects.length;i++) {
			sta.setObject(i+1, objects[i]);
		}
		ret=sta.executeUpdate();
		return ret;
	}
	
	public ResultSet qurey(Connection conn,String sql,Object...parameter) throws SQLException {
		ResultSet ret=null;
		PreparedStatement sta=conn.prepareStatement(sql);
		for(int i=1;i <=parameter.length;i++) {
			sta.setObject(i, parameter[i-1]);
		}
		ret=sta.executeQuery();
		return ret;
	}
}
