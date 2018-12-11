package com.hellojava.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.hellojava.dbmanager.DBManager;
import com.hellojava.entity.Dispatcher;

public class DispatcherDao extends DBManager {
	public int execute(Dispatcher dispatcher) throws SQLException {
		Connection con=this.openConnection();
		int result=0;
		String sql="insert into stuff_dispatcher(warehousing_id,stuffName,supplierName,"
				+ "warehousing_timee,nw,driver_name,record_name,GW,tare,carNumber) values(?,?,?,?,?,?,?,?,?,?)";
		Object obj[]= {dispatcher.getWarehousing_id(),dispatcher.getStuffName(),dispatcher.getSupplierName(),
				dispatcher.getWarehousing_timee(),dispatcher.getNw(),dispatcher.getDriver_name(),dispatcher.getRecord_name(),dispatcher.getGW(),
				dispatcher.getTare(),dispatcher.getCarNumber()};
			result=this.excute(con, sql, obj);
			return result;
	}
}
