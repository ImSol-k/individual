package com.book;

import java.util.Scanner;

public class ManagerSystem {

	Scanner in = new Scanner(System.in);
	BookDao bookDao = new BookDao();
	boolean start = true;
	int num;

	/*******************************************
	 * 대여관리
	 */
	public void rentMain() {
		while (start) {
			System.out.println("────────────────📔 대여 관리 📔───────────────");
			System.out.println(" 1. 대여\n 2. 반납\n 3. 대여현황\n 4. 뒤로가기");
			System.out.print(">> ");
			num = in.nextInt();
			in.nextLine();
			switch (num) {
			case 1:
				System.out.println("──────────────────📔 대여 📔─────────────────");
				bookDao.BookSelect("list");
				bookDao.bookRent();
				break;
			case 2:
				System.out.println("──────────────────📔 반납 📔─────────────────");
				bookDao.bookReturn();
				break;
			case 3:
				System.out.println("─────────────────📔 대여현황 📔────────────────");
				bookDao.bookCurrent();
				break;
			case 4:
				start = false;
				break;
			default:
				System.out.println("[잘못입력하셨습니다]");
				break;
			}
		}
	} // rentMain()

	/*******************************************
	 * 회원관리
	 */
	public void memberMain() {
		while (start) {
			System.out.println("────────────────📔 회원 관리 📔───────────────");
			System.out.println(" 1. 회원리스트\n 2. 추가\n 3. 수정\n 4. 삭제 \n 5. 검색 \n 6. 뒤로가기");
			System.out.print(">> ");
			num = in.nextInt();
			in.nextLine();
			switch (num) {
			case 1:
				System.out.println("───────────────📔 회원 리스트 📔───────────────");
				break;
			case 2:
				System.out.println("──────────────────📔 추가 📔─────────────────");
				break;
			case 3:
				System.out.println("──────────────────📔 수정 📔─────────────────");
				break;
			case 4:
				System.out.println("──────────────────📔 삭제 📔─────────────────");
				break;
			case 5:
				System.out.println("──────────────────📔 검색 📔─────────────────");
				break;
			case 6:
				start = false;
				break;
			default:
				System.out.println("[잘못입력하셨습니다]");
				break;
			}
		}
	} // memberMain()

	/*******************************************
	 * 책관리
	 */
	public void bookMain() {
		while (start) {
			System.out.println("────────────────📔 책 관리 📔────────────────");
			System.out.println(" 1. 책리스트\n 2. 추가\n 3. 수정\n 4. 삭제 \n 5. 검색 \n 6. 뒤로가기");
			System.out.print(">> ");
			num = in.nextInt();
			in.nextLine();
			switch (num) {
			case 1:
				System.out.println("────────────────📔 책 리스트 📔───────────────");
				bookDao.BookSelect("list");
				break;
			case 2:
				System.out.println("──────────────────📔 추가 📔─────────────────");
				bookDao.bookInsert();
				bookDao.BookSelect("list");
				break;
			case 3:
				System.out.println("──────────────────📔 수정 📔─────────────────");
				bookDao.BookSelect("update");
				bookDao.bookUpdate();
				break;
			case 4:
				System.out.println("──────────────────📔 삭제 📔─────────────────");
				bookDao.BookSelect("list");
				bookDao.bookDelete();
				break;
			case 5:
				
				bookFind();
				break;
			case 6:
				start = false;
				break;
			default:
				System.out.println("[잘못입력하셨습니다]");
				break;
			}

		}
	} // bookMain()

	/****************************************
	 * 책 검색
	 */
	public void bookFind() {
		start = true;
		
		while (start) {
			System.out.println("──────────────────📔 검색 📔─────────────────");
			System.out.println("[검색할 키워드 선택]");
			System.out.println(" 1. 제목\n 2. 번호\n 3. 작가 \n 4. 뒤로가기");
			System.out.print(">> ");
			num = in.nextInt();
			in.nextLine();
			switch (num) {
			case 1:
				bookDao.bookFind("title");
				break;
			case 2:
				bookDao.bookFind("id");
				break;
			case 3:
				bookDao.bookFind("author");
				break;
			case 4:
				start = false;
				break;
			default:
				System.out.println("[잘못 입력하셨습니다]");
				break;
			}
		}
	} //bookFind()
	
	
	
}
