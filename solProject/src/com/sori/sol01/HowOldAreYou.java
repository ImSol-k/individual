package com.sori.sol01;

import java.util.Scanner;

public class HowOldAreYou {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int item;
		int age;
		
		System.out.println("구매하실 상품을 선택하세요");
		System.out.println("1. 콜라\n2. 오렌지쥬스\n3. 소주\n4.맥주");
		item = in.nextInt();
		
		if(item == 1 && item == 2) {
			System.out.println("구매가 완료되었습니다.");
		}
		else if(item == 3 && item == 4) {
			System.out.println("미성년자 구매 불가 상품입니다");
			System.out.print("나이를 입력하세요 : ");
			age = in.nextInt();
			if(age >= 20) {
				System.out.println("성인인증완료. \n구매가 완료되었습니다");
			}
			else {
				System.out.println("성인인증 실패\n구매를 실패하였습니다.");
			}
		}
		
		
		in.close();
		
		
		
	}

}
