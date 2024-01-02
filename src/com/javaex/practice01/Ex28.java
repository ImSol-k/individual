package com.javaex.practice01;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		//원화를 달러로 계산하는 프로그램 작성
		
		Scanner in = new Scanner(System.in);
		
		final double ownD = 1230.95;
		int won;
		
		
		System.out.print("환전할 원화를 입력하세요 : ");
		won = in.nextInt();
		
		System.out.println("받으실 달러는 " + (won / ownD));
		
		in.close();
		
	}

}
