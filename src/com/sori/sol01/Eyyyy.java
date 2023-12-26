package com.sori.sol01;

import java.util.Scanner;

public class Eyyyy {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int score;
		
		System.out.print("근무시간 : ");
		score = in.nextInt();
		
		if(score > 8)
		{
			System.out.println("임금은 " + (score * 12000) + "원 입니다.");
		}
		if(score <= 8)
		{
			System.out.println("임금은 " + (score * 10000) + "원 입니다.");
		}
		
		in.close();
	}

}
