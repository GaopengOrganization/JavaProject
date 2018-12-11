package com.hellojava.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hellojava.dbmanager.DBManager;
import com.hellojava.entity.Shipments;

public class LShipmentsA extends DBManager{
	
	public List<Shipments> seekShipments() throws SQLException{
		List<Shipments> seek=new ArrayList();
		String sql="select * from shipmentsa";
		Connection con=this.openConnection();
		Shipments ship;
		Object[] parameter= {};
		ResultSet res= this.qurey(con, sql, parameter);
		
		if(res.next()) {
			do {
				ship=new Shipments();
				ship.setDepartID(res.getString("departID"));
				ship.setDepartName(res.getString("departName"));
				ship.setCarId(res.getString("carId"));
				ship.setWorkSite(res.getString("workSite"));
				ship.setCons_org(res.getString("cons_org"));
				ship.setDepartTime(res.getString("departTime"));
				ship.setRecord_name(res.getString("record_name"));
				ship.setReceipient_name(res.getString("receipient_name"));
				ship.setEngnine_name(res.getString("engnine_name"));
				ship.setTank_no(res.getString("tank_no"));
				ship.setGW(res.getDouble("Gw"));
				ship.setTare(res.getDouble("tare"));
				ship.setNW(res.getDouble("NW"));
				ship.setDriver(res.getString("driver"));
				ship.setTest(res.getString("test"));
				ship.setRecorder(res.getString("recorder"));
				seek.add(ship);
			}while(res.next());
		}
		return seek;
	}
}
