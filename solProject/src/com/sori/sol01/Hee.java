package com.sori.sol01;

import java.util.Scanner;

public class Hee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int year = 2023;
		int age;
		float h;
				
		System.out.println("===============================");
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		sc.nextLine();	//숫자 먼저 받아올때는 개행 넣어주기
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("키를 입력하세요 : ");
		h = sc.nextFloat();
		System.out.println("===============================");
		
		System.out.println("이름 : " + name + "\n나이 : " + age + "\n키 : " + h + "cm");
		System.out.println("===============================");
		sc.close();		
		System.out.println("올해는 " + year + "년입니다.");
		System.out.println("당신은 내년에 " + (age + 1) + "살 이군용!ㅋㅋ");
		System.out.println("당신은 " + (year - age + 1) + "년도생 입니다");
		System.out.println("2m까지 " + (200 - h) + "cm 남았습니다.");
		System.out.println("===============================");
		

	}

}
