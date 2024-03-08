package com.sori.sol01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		//1에서 100까지의 수에서 5의 배수이면서 7의 배수인 수 출력		
		for (int i = 1; i < 100; i++) {
			if(i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
		
		//숫자 입력받아서 피라미드쌓기
		/*
		Scanner in = new Scanner(System.in);
		int num;
		System.out.print("숫자를 입력하세요 : ");
		num = in.nextInt();
		for (int i = 0; i < num; i++) {
			for(int j = 0; j <= i;j++) {
				System.out.print(i + 1);
			}
			System.out.println();
		}
		in.close();
		*/
		
		//구구단 출력
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9;j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print((j+i) + "\t");
			}
			System.out.println();
		}
		
	}

}
