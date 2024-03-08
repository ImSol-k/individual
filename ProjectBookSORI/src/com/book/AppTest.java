package com.book;

public class AppTest {

	public static void main(String[] args) {
		
		BookDao bookDao = new BookDao();
		ManagerSystem ms = new ManagerSystem();
		//bookDao.BookSelect("list");
		//bookDao.bookInsert();
		//bookDao.bookUpdate();
		//bookDao.bookDelete();
		//bookDao.bookIdSetting();
		//ms.memberMain();
		//ms.bookMain();
		ms.rentMain();
	}

}
