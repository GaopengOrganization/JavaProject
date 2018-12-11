package com.hellojava.entity;

public class Contract {
	int id;
	String wo_site;
	String con_org;
	double price;
	int account;
	String address;
	String peo_Name;
	String iphone;
	String saleName;
	String org;
	String saleNumber;
	String leader;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWo_site() {
		return wo_site;
	}
	public void setWo_site(String wo_site) {
		this.wo_site = wo_site;
	}
	public String getCon_org() {
		return con_org;
	}
	public void setCon_org(String con_org) {
		this.con_org = con_org;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPeo_Name() {
		return peo_Name;
	}
	public void setPeo_Name(String peo_Name) {
		this.peo_Name = peo_Name;
	}
	public String getIphone() {
		return iphone;
	}
	public void setIphone(String iphone) {
		this.iphone = iphone;
	}
	public String getSaleName() {
		return saleName;
	}
	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getSaleNumber() {
		return saleNumber;
	}
	public void setSaleNumber(String saleNumber) {
		this.saleNumber = saleNumber;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	@Override
	public String toString() {
		return "Contract [id=" + id + ", wo_site=" + wo_site + ", con_org=" + con_org + ", price=" + price
				+ ", account=" + account + ", address=" + address + ", peo_Name=" + peo_Name + ", iphone=" + iphone
				+ ", saleName=" + saleName + ", org=" + org + ", saleNumber=" + saleNumber + ", leader=" + leader
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
