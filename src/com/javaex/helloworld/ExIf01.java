package com.javaex.helloworld;

import java.util.Scanner;

public class ExIf01 {

	public static void main(String[] args) {
		
		//알바 시급계산
		//8시간까지는 시간당 10,000
		//8시간초과는 시간당 12,000
		
		Scanner in = new Scanner(System.in);
		int time;
		
		System.out.print("근무시간 : ");
		time = in.nextInt();
		
		if(time <= 8) {
			System.out.println("임금은 " + time * 10000 + "원 입니다.");
		}
		else {
			System.out.println("임금은 " + (10000 * 8 + (time - 8) * 12000) + "원 입니다.");
		}
		
		
		in.close();
		
		
	}

}
