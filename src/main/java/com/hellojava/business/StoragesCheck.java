package com.hellojava.business;

import java.sql.SQLException;

import com.hellojava.dao.StoragesDao;
import com.hellojava.entity.Storages;

public class StoragesCheck {
	private StoragesDao storagesDao;
	public boolean execute(Storages Storages) {
		storagesDao=new StoragesDao();
		boolean bool=false;
		try {
			storagesDao.execute(Storages);
			bool=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}
}
