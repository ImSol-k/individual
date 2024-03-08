package com.javaex.repetition;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int star;
		
		System.out.print("반복할 횟수 : ");
		star = in.nextInt();
		
		for(int i = 0; i < star; i++) {
			for(int j = star; j > i; j--) {
				System.out.print("*");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for(int j = star; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < star; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			for(int j = star; j - 1> i; j--) {
				System.out.print(" ");
			}
			for(int j = star; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		in.close();

	}

}
