package com.demoproject.springcoreagain3;
import java.util.*;

public class Teacher {
	private String name;
	private List<String> phones;
	private Set<String> offices;
	private Map<String,String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", phones=" + phones + ", offices=" + offices + ", courses=" + courses + "]";
	}
	public Set<String> getOffices() {
		return offices;
	}
	public void setOffices(Set<String> offices) {
		this.offices = offices;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
}
