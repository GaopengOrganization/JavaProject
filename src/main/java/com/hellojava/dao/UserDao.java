package com.hellojava.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hellojava.dbmanager.DBManager;
import com.hellojava.entity.User;

public class UserDao extends DBManager {
	public List<User> query(int page,int pageSize) throws SQLException{
		Connection con=this.openConnection();
		List<User> list=new ArrayList<User>();
		String sql="select * from user limit ?,?";
		Object obs[]= {page*pageSize,pageSize};
		ResultSet result=this.qurey((com.mysql.jdbc.Connection) con, sql, obs);
		while(result.next()) {
			User user=new User();
			user.setUserId(result.getString("userId"));
			user.setUserName(result.getString("userName"));
			user.setUserPass(result.getString("userPass"));
			list.add(user);
		}
		return list;
	}
}
