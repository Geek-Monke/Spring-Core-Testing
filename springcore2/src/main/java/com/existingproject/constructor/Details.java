package com.existingproject.constructor;

public class Details {
	private String name;
	private int rent;
	private int years;
	public Details(String name, int rent, int years) {
		super();
		this.name = name;
		this.rent = rent;
		this.years = years;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Details [name=" + name + ", rent=" + rent + ", years=" + years + "]";
	}
}
