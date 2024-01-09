package com.sori.employee;

public class Regular extends Employee{
	
	private int hourlyWage = 10000;
	
	public Regular(String name, String team, int age, int pay, int hourlyWage) {
		super(name, team, age, pay);
		this.hourlyWage = hourlyWage;
	}
	
	public void pay() {
		
	}
	
}
