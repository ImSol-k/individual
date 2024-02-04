package com.book;

import java.util.Scanner;

public class AppManager {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ManagerSystem managerSystem = new ManagerSystem();
		boolean start = true;
		int num;
		String pw;
		
		
		System.out.println("───────────📔 도서대여관리 프로그램 📔───────────");
		System.out.println("[관리자 비밀번호를 입력하세요]");
		while(start) {
			System.out.print(">> ");
			pw = in.nextLine();
			if("manager".equals(pw)) {
				System.out.println("[프로그램 시작]");
				start = false;
			}
			else {
				System.out.println("[잘못 입력하셨습니다 다시 입력해주세요]");
				start = true;
			}
		}
		start = true;
		while(start) {
			System.out.println("───────────────📔 메뉴 선택 📔───────────────");
			System.out.println(" 1. 대여관리\n 2. 회원리스트\n 3. 책관리\n 4. 종료");
			System.out.print(">> ");
			num = in.nextInt();
			in.nextLine();
			switch(num) {
			case 1:
				managerSystem.rentMain();
				break;
			case 2:
				managerSystem.memberMain();
				break;
			case 3:
				managerSystem.bookMain();
				break;
			case 4:
				System.out.println("──────────────📔 프로그램 종료 📔──────────────");
				start = false;
				break;
			default:
				System.out.println("[잘못입력하셨습니다]");
				break;
			}
		}
		
		
		
		in.close();
	} //main()

}
