package com.hellojava.entity;

public class Staff {
	int id;
	String staName;
	String staSec;
	String stadu;
	double income;
	String idCard;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStaName() {
		return staName;
	}
	public void setStaName(String staName) {
		this.staName = staName;
	}
	public String getStaSec() {
		return staSec;
	}
	public void setStaSec(String staSec) {
		this.staSec = staSec;
	}
	public String getStadu() {
		return stadu;
	}
	public void setStadu(String stadu) {
		this.stadu = stadu;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Stuff [id=" + id + ", staName=" + staName + ", staSec=" + staSec + ", stadu=" + stadu + ", income="
				+ income + ", idCard=" + idCard + ", age=" + age + ", toString()=" + super.toString() + "]";
	}
}
