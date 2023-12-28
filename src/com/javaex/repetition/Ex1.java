package com.javaex.repetition;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int i = 0;
		int num;
		
		System.out.print("횟수 : ");
		num = in.nextInt();
		
		while(i < num) {
			
			System.out.println("I like Java" + i);
			
			i++;
		}
		
		in.close();
		
	}

}
