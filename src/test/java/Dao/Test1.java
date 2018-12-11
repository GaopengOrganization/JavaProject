package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.hellojava.dbmanager.DBManager;
import com.hellojava.entity.Staff;
import com.mysql.jdbc.Connection;


public class Test1 extends DBManager{
	@Test
	public void ted() throws SQLException {
		Connection conn=(Connection) this.openConnection();
		Staff stu=null;
		String sql = "select *from staff where id=?";
		Integer[] obj= {1};
		ResultSet res=this.qurey( conn, sql, obj);
		if(res.next()) {
		do{
			stu=new Staff();
			stu.setId(res.getInt("id"));
		}while(res.next());
		}
		System.out.println(stu);
		
	}
}
