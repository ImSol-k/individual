package com.javaex.helloworld;

import java.util.Scanner;

public class IfTwo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int score;
		
		/*
		//3의배수 판별
		System.out.println("점수를 입력하세요");
		score = in.nextInt();
		
		if(score % 3 == 0) {
			System.out.println(score + "은(는) 3의 배수 입니다.");
		}
		else {
			System.out.println(score + "은(는) 3의 배수가 아닙니다.");
		}
		*/
		
		/*
		//등급표시
		//90점이상 A, 80~89 B, 70~79 C, 60~69 D, 60점미만 F
		 System.out.print("점수를 입력하세요 : ");
		 score = in.nextInt();
		 
		 if(90 <= score) {
			 System.out.println("A등급");
		 }
		 else if(80 <= score) {
			 System.out.println("B등급");
		 }
		 else if(70 <= score) {
			 System.out.println("C등급");
		 }
		 else if(60 <= score) {
			 System.out.println("D등급");
		 }
		 else {
			 System.out.println("F등급");
		 }
		 */
		
		
		//숫자를 입력받아 홀수, 짝수, 음수, 0 구별하기
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 : ");
		score = in.nextInt();
		
		if(score % 2 == 0 && score != 0) {
			System.out.println("짝수입니다.");
		}
		else if(score % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		else if(score < 0) {
			System.out.println("음수입니다.");
		}
		else if(score == 0) {
			System.out.println("0입니다.");
		}
		
		
		in.close();
		 
		
		

	}

}
