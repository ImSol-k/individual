package com.javaex.helloworld;

import java.util.Scanner;

public class ExIf04 {

	public static void main(String[] args) {
		
		
		//등급표시
		//90점이상 A, 80~89 B, 70~79 C, 60~69 D, 60점미만 F
		Scanner in = new Scanner(System.in);
		int score;
		
		System.out.print("점수를 입력하세요 : ");
		score = in.nextInt();
			
		if(100 < score || 0 > score) {
			System.out.println("등급 범위 벗어남");
		}
		else if(90 <= score) {
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
		in.close();

	}

}
