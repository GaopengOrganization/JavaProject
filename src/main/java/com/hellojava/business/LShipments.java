package com.hellojava.business;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hellojava.dao.LShipmentsA;
import com.hellojava.entity.Shipments;

public class LShipments {
	
	public List<Shipments> seekShipments(){
		LShipmentsA lship=new LShipmentsA();
		List<Shipments> lis=new ArrayList();
		try {
			lis=lship.seekShipments();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lis;
	}
	
	
}
