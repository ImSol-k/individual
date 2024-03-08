package com.javaex.helloworld;

import java.util.Scanner;

public class ExIf05 {

	public static void main(String[] args) {
		
		//숫자를 입력받아 홀수, 짝수, 음수, 0 구별하기
		Scanner in = new Scanner(System.in);
		int num;
		
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 : ");
		num = in.nextInt();
		/*
		if(num % 2 == 0 && num != 0) {
			System.out.println("짝수입니다.");
		}
		else if(num % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		else if(num < 0) {
			System.out.println("음수입니다.");
		}
		else {
			System.out.println("0입니다.");
		}
		*/
		if(0 < num) {
			if(num % 2 == 0) {
				System.out.println("(양수)짝수입니다.");
			}
			else {
				System.out.println("(양수)홀수입니다.");
			}
		}
		else if(0 > num) {
			if(num % 2 == 0) {
				System.out.println("(음수)짝수입니다.");
			}
			else {
				System.out.println("(음수)홀수입니다.");
			}
		}
		else {
			System.out.println("0입니다.");
		}
		
		in.close();
	}

}
