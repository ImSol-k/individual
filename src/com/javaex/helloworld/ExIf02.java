package com.javaex.helloworld;

import java.util.Scanner;

public class ExIf02 {

	public static void main(String[] args) {
		
		//8시간까지는 시간당 10,000
		//8시간 초과시 시간당 1.5배
		Scanner in = new Scanner(System.in);
		int time;
		
		System.out.print("근무시간 : ");
		time = in.nextInt();
		
		int eight = time * 10000;
		if(time <= 8) {
					
			System.out.println("임금은 " + eight + "원 입니다.");
		}
		else {
			System.out.println("임금은 " + (80000 + (time - 8) * 10000 / 2 * 3)  + "원 입니다.");
		}
		
		in.close();

	}

}
