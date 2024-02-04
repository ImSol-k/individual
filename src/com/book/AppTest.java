package com.book;

public class AppTest {

	public static void main(String[] args) {
		
		BookDao bookDao = new BookDao();
		
		bookDao.BookSelect("update");
		bookDao.bookInsert();
		//bookDao.bookUpdate();
		
	}

}
