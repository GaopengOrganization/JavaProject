package com.hellojava.entity;

public class Shipments {

	private int  id;
	private String departID;
	private String departName;
	private String carId;
	private String workSite;
	private String cons_org;
	private String departTime;
	private String record_name;
	private String receipient_name;
	private String engnine_name;
	private String tank_no;
	private double GW;
	private double tare;
	private double NW;
	private String driver;
	private String test;
	private String recorder;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartID() {
		return departID;
	}
	public void setDepartID(String departID) {
		this.departID = departID;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getWorkSite() {
		return workSite;
	}
	public void setWorkSite(String workSize) {
		this.workSite = workSize;
	}
	public String getCons_org() {
		return cons_org;
	}
	public void setCons_org(String cons_org) {
		this.cons_org = cons_org;
	}
	public String getDepartTime() {
		return departTime;
	}
	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}
	public String getRecord_name() {
		return record_name;
	}
	public void setRecord_name(String record_name) {
		this.record_name = record_name;
	}
	public String getReceipient_name() {
		return receipient_name;
	}
	public void setReceipient_name(String receipient_name) {
		this.receipient_name = receipient_name;
	}
	public String getEngnine_name() {
		return engnine_name;
	}
	public void setEngnine_name(String engnine_name) {
		this.engnine_name = engnine_name;
	}
	public String getTank_no() {
		return tank_no;
	}
	public void setTank_no(String tank_no) {
		this.tank_no = tank_no;
	}
	public double getGW() {
		return GW;
	}
	public void setGW(double gW) {
		GW = gW;
	}
	public double getTare() {
		return tare;
	}
	public void setTare(double tare) {
		this.tare = tare;
	}
	public double getNW() {
		return NW;
	}
	public void setNW(double nW) {
		NW = nW;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getRecorder() {
		return recorder;
	}
	public void setRecorder(String recorder) {
		this.recorder = recorder;
	}
	@Override
	public String toString() {
		return "Shipments [id=" + id + ", departID=" + departID + ", departName=" + departName + ", carId=" + carId
				+ ", workSite=" + workSite + ", cons_org=" + cons_org + ", departTime=" + departTime + ", record_name="
				+ record_name + ", receipient_name=" + receipient_name + ", engnine_name=" + engnine_name + ", tank_no="
				+ tank_no + ", GW=" + GW + ", tare=" + tare + ", NW=" + NW + ", driver=" + driver + ", test=" + test
				+ ", recorder=" + recorder + "]";
	}
	
	
	
	

}
