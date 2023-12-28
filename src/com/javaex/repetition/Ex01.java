package com.javaex.repetition;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int i = 1;
		int dan;
		
		System.out.print("단 : ");
		dan = in.nextInt();
		
		while(i <= 9) {
			
			System.out.println(dan + "*" + i + "=" + (dan * i));
			
			i++;
		}
		
		in.close();
		
	}

}
