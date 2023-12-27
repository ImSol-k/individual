package com.javaex.helloworld;

import java.util.Scanner;

public class ExIf04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int score;
		
		
		//3의배수 판별
		System.out.println("점수를 입력하세요");
		score = in.nextInt();
		
		if(score % 3 == 0) {
			System.out.println(score + "은(는) 3의 배수 입니다.");
		}
		else {
			System.out.println(score + "은(는) 3의 배수가 아닙니다.");
		}
		
		
		
		in.close();
		 
		
		

	}

}
