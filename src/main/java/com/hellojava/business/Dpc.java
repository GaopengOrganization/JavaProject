package com.hellojava.business;

import java.sql.SQLException;

import com.hellojava.dao.DispatcherDao;
import com.hellojava.entity.Dispatcher;

public class Dpc {
	private DispatcherDao Daodispatcher;
	public boolean execute(Dispatcher dispatcher) {
		boolean bool=false;
		Daodispatcher=new DispatcherDao();
		int result;
		try {
			result = Daodispatcher.execute(dispatcher);
			if(result!=0) {
				bool=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}
}
