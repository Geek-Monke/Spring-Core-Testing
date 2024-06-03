package com.demoproject.springcore4;

public class Laptop {
	
	public Laptop(String name) {
		super();
		this.name = name;
	}
	private String name;


	@Override
	public String toString() {
		return "Laptop [Name=" + name + "]";
	}
	public void init() {
		System.out.println("Init mehtod called.");
	}
	public void bye() {
		System.out.println("Destroy method called");
	}
}
