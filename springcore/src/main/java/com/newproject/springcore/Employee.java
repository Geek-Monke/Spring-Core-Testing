package com.newproject.springcore;

public class Employee {
	private int id;
	private int salary;
	private int age;
	private address add;
	public address getAdd() {
		return add;
	}
	public void setAdd(address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", age=" + age + ", name=" + name + ", address=" + add + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, int salary, int age, String name, address add) {
		super();
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.name = name;
		this.add=add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}
