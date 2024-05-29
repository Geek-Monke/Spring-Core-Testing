package com.existingproject.constructor;

public class Location {
	private Details details;
	private String city;
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location(Details details, String city) {
		super();
		this.details = details;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Location [details=" + details + ", city=" + city + "]";
	}
}
