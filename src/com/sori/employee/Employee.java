package com.sori.employee;

public class Employee {
	
	private String name;	
	private String team;
	private int age;
	private int pay;
	
	
	public Employee() { }
	public Employee(String name, String team, int age, int pay) {
		super();
		this.name = name;
		this.team = team;
		this.age = age;
		this.pay = pay;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", team=" + team + ", age=" + age + ", pay=" + pay + "]";
	}
	
	
}
