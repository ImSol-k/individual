package com.sori.employee;

public class Regular extends Employee{
	
	private int pay;
	
	public Regular(String name, String team, int age, int pay) {
		super(name, team, age);
		this.pay = pay;
	}
	
	public int pay() {
		return 0;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + getName() + ", 나이 : " + getAge() + ", 부서 : " + getTeam() + "월급 : " + pay());
	}
	
}
