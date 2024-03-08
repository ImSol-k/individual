package com.sori.sol01;

import java.util.Scanner;

public class IfGame {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int mon, day;
		
		System.out.println("==========================");
		System.out.print("태어난 달을 입력하세요 : ");
		mon = in.nextInt();
		System.out.print("태어난 날을 입력하세요 : ");
		day = in.nextInt();
		System.out.println("==========================");
		
		System.out.print(mon + "월 " + day + "일 ");
		if(mon == 1 && day >= 20)
		{
			System.out.println("물병자리");
		}
		else if(mon == 2 && day <= 18) {
			System.out.println("물병자리");
		}
		else if(mon == 2 && day >= 19) {
			System.out.println("물고기자리");
		}
		else if(mon == 3 && day <= 20) {
			System.out.println("물고기자리");
		}
		else if(mon == 3 && day >= 21) {
			System.out.println("양자리");
		}
		else if(mon == 4 && day <= 19) {
			System.out.println("양자리");
		}
		else if(mon == 4 && day >= 20) {
			System.out.println("황소자리");
		}
		else if(mon == 5 && day <= 20) {
			System.out.println("황소자리");
		}
		else if(mon == 5 && day >= 21) {
			System.out.println("쌍둥이자리");
		}
		else if(mon == 6 && day <= 21) {
			System.out.println("쌍둥이자리");
		}
		else if(mon == 6 && day >= 22) {
			System.out.println("게자리");
		}
		else if(mon == 7 && day <= 22) {
			System.out.println("게자리");
		}
		else if(mon == 7 && day >= 23) {
			System.out.println("사자자리");
		}
		else if(mon == 8 && day <= 22) {
			System.out.println("사자자리");
		}
		else if(mon == 8 && day >= 23) {
			System.out.println("처녀자리");
		}
		else if(mon == 9 && day <= 23) {
			System.out.println("처녀자리");
		}
		else if(mon == 9 && day >= 24) {
			System.out.println("천칭자리");
		}
		else if(mon == 10 && day <= 22) {
			System.out.println("천칭자리");
		}
		else if(mon == 10 && day >= 23) {
			System.out.println("전갈자리");
		}
		else if(mon == 11 && day <= 22) {
			System.out.println("전갈자리");
		}
		else if(mon == 11 && day >= 23) {
			System.out.println("사수자리");
		}
		else if(mon == 12 && day <= 24) {
			System.out.println("사수자리");
		}
		else if(mon == 12 && day >= 25)
		{
			System.out.println("염소자리");
		}
		else if(mon == 1 && day <= 19) {
			System.out.println("염소자리");
		}
		else {
			System.out.println("생일을 잘못입력하셨습니다.");
		}
		
		System.out.println("==========================");
		
		
		
		
		in.close();

	}

}
