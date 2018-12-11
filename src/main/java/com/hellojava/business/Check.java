package com.hellojava.business;

import java.sql.SQLException;
import java.util.List;

import com.hellojava.dao.AdminDao;
import com.hellojava.dao.UserDao;
import com.hellojava.entity.Admin;
import com.hellojava.entity.User;

public class Check {
	private AdminDao daoadmin;
	private UserDao daouser;
	public boolean query(Admin admin) {
		boolean bool=false;
		daoadmin=new AdminDao();
		try {
			Admin result=daoadmin.query(admin);
			if(result!=null) {
				bool=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bool;
	}
	public List<User> querys(int page,int pageSize){
		List list=null;
		daouser=new UserDao();
		try {
			list=daouser.query(page, pageSize);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
