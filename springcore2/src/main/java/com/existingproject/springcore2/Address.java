package com.existingproject.springcore2;

public class Address {
	private int house_no;
	private String street;
	private int pincode;
	private String city;
	public int getHouse_no() {
		return house_no;
	}
	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int house_no, String street, int pincode, String city) {
		super();
		this.house_no = house_no;
		this.street = street;
		this.pincode = pincode;
		this.city = city;
	}
	@Override
	public String toString() {
		return "address [house_no=" + house_no + ", street=" + street + ", pincode=" + pincode + ", city=" + city + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
