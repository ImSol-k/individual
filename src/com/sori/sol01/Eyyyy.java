package com.sori.sol01;

import java.util.Scanner;

public class Eyyyy {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int mon;
		
		System.out.print("근무시간 : ");
		mon = in.nextInt();
		
		if(mon > 8)
		{
			System.out.println("임금은 " + (mon * 12000) + "원 입니다.");
		}
		if(mon <= 8)
		{
			System.out.println("임금은 " + (mon * 10000) + "원 입니다.");
		}
		
		in.close();
	}

}
