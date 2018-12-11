package com.hellojava.dbmanager;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBManagerUtil {
	static Properties p=null;
	static {
		p=new Properties();
		InputStream a=DBManagerUtil.class.getClassLoader().getResourceAsStream("db.propreties");
		try {
			p.load(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String value(String key) {
		return p.getProperty(key);
	}
}
