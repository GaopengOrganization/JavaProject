package com.hellojava.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.hellojava.dbmanager.DBManager;
import com.hellojava.entity.Storages;

public class StoragesDao extends DBManager{
	private Storages storages;
	public int execute(Storages storages) throws SQLException {
		Connection con=this.openConnection();
		int result=0;
		String sql="insert into storages(datetimes,sandHead,waste,cement,"
				+ "rawSand,coal,additiveA,yieldSand,people,additiveB) values(?,?,?,?,?,?,?,?,?,?)";
		Object obj[]= {storages.getDatetimes(),storages.getSandHead(),storages.getWaste(),storages.getCement(),storages.getRawSand(),
				storages.getCoal(),storages.getAdditiveA(),storages.getYieldSand(),storages.getPeople(),storages.getAdditiveB()};
		result=this.excute(con, sql, obj);
		this.closeConnection(con);
		return result;
	}
}
