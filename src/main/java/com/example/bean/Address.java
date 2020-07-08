package com.example.bean;

public class Address {
	String name;
	String houseNo;
	String landMark;
	String city; 
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address(String houseNo, String landMark, String city, String name) {
		super();
		this.name = name;
		this.houseNo = houseNo;
		this.landMark = landMark;
		this.city = city;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public String getLandMark() {
		return landMark;
	}

	public String getCity() {
		return city;
	}


}
