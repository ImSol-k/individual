package com.javaex.helloworld;

import java.util.Scanner;

public class ExIf06 {

	public static void main(String[] args) {
		
		//과목번호를 입력받아 강의실 번호 출력
		//1. R101호, 2. R202호, 3. R303호, 4. R404호, 나머지는 상담원에게 문의
		
		Scanner in = new Scanner(System.in);
		int num;
		
		
		System.out.println("과목을 선택하세요 \n(1.자바  2.C  3.C++  4.파이썬)");
		System.out.print("과목번호 : ");
		num = in.nextInt();
		
		if(num == 1) {
			System.out.println("R101호");
		}
		else if(num == 2) {
			System.out.println("R202호");
		}
		else if(num == 3) {
			System.out.println("R303호");
		}
		else if(num == 4) {
			System.out.println("R404호");
		}
		else {
			System.out.println("상담원에게 문의하세요");
		}
		
		
		
		in.close();
		
		

	}

}
