package com.javaex.repetition;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int star;
		
		System.out.print("반복횟수 : ");
		star = in.nextInt();
		
		for(int i = 0; i < star; i++) {
			for(int j = star - 1; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		in.close();

	}

}
