package com.javaex.repetition;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		//별 마름모 모양으로 출력
		Scanner in = new Scanner(System.in);
		int star;
		
		System.out.print("반복할 횟수 : ");
		star = in.nextInt();
		
		
		for(int i = 1; i <= star; i++) {
			for(int j = star; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < star; i++) {
			for(int j = 0; j < i ;j++) {
				System.out.print(" ");
			}
			for(int j = star; j > i; j--) {
				System.out.print("*");
			}
			for(int l = star; l - 1 > i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		in.close();
		
	}

}
