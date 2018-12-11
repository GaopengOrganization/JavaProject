package com.hellojava.business;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hellojava.dao.LContract;
import com.hellojava.entity.Contract;

public class LCon {
	public List<Contract> seek(){
		List<Contract> contr=new ArrayList();
		LContract seek= new LContract(); 
		try {
			contr=seek.seekContract();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return contr;
	}
	
	public boolean add(Contract cont) {
		boolean boo=false;
		int n=0;
		Contract contra=cont;
		LContract seek= new LContract(); 
		try {
			n=seek.addContract(contra);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(n>=1) {
			boo=true;
		}
		return boo;
	}
}
