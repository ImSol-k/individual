package com.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDao {

	/****************************************
	 * Field
	 */
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Scanner in = new Scanner(System.in);
	List<BookVo> bookList = null;
	BookVo bookVo = null;
	String query = "";
	private int count;
	private int bookId;
	private String title, author, pubs, pubDate, state, yn;

	/****************************************
	 * 드라이버 연결
	 */
	public void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/library_db";
			conn = DriverManager.getConnection(url, "library", "library");
		} catch (ClassNotFoundException e) {
			System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
	} // getConnection();

	/****************************************
	 * 자원정리
	 */
	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
	} // close()

	/****************************************
	 * 테이블 불러오기
	 */
	public void BookSelect(String list) {
		getConnection();
		count = 1;
		try {
			bookList = new ArrayList<BookVo>();
			String query = "";
			query += " select l.book_id, title, author, pubs, pub_date, ";
			query += " 		  case when (rent_date is null) or (rent_date is not null and return_date is not null) then '대여가능' ";
			query += " 			   else '대여중' end 'state'  ";
			query += " from librarys l left join rents r ";
			query += " on l.book_id = r.book_id ";

			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				bookId = rs.getInt("book_id");
				title = rs.getString("title");
				author = rs.getString("author");
				pubs = rs.getString("pubs");
				pubDate = rs.getString("pub_date");
				state = rs.getString("state");
				bookVo = new BookVo(bookId, title, author, pubs, pubDate, state);
				bookList.add(bookVo);
			}
			if ("list".equals(list)) {
				System.out.println(
						"┌───────────────────────────────────────────────────────────────────────────────────────┐");
				System.out.println(String.format("│%s\t│%-10s\t│%-10s\t│%-10s\t│%-10s\t│%-10s\t│", "책번호", "제목", "작가",
						"출판사", "출판일", "상태"));
				System.out.println(
						"├───────────────────────────────────────────────────────────────────────────────────────┤");
				for (int i = 0; i < bookList.size(); i++) {
					bookList.get(i).showBook("list");
				}
				System.out.println(
						"└───────────────────────────────────────────────────────────────────────────────────────┘");
			} else if ("update".equals(list)) {
				System.out.println("┌───────────────────────────────────────────────────────────────────────┐");
				System.out.println(
						String.format("│%s\t│%-10s\t│%-10s\t│%-10s\t│%-10s\t│", "책번호", "제목", "작가", "출판사", "출판일"));
				System.out.println("├───────────────────────────────────────────────────────────────────────┤");
				for (int i = 0; i < bookList.size(); i++) {
					bookList.get(i).showBook("update");
				}
				System.out.println("└───────────────────────────────────────────────────────────────────────┘");
			}
		} catch (SQLException e) {
			System.out.println("error:" + e);
		}
		close();
	} // bookSelect()

	/****************************************
	 * 책 추가
	 */
	public void bookInsert() {
		getConnection();
		count = 1;
		try {
			System.out.print("책이름 >> ");
			title = in.nextLine();
			System.out.print("작가 >> ");
			author = in.nextLine();
			System.out.print("출판사 >> ");
			pubs = in.nextLine();
			System.out.print("출판일 >> ");
			pubDate = in.nextLine();

			query = "";
			query += " insert into librarys ";
			query += " values (null ";
			query += " , ?";
			if (author != "") {
				query += " , ?";
			} else {
				query += " , null";
			}
			if (pubs != "") {
				query += " , ?";
			} else {
				query += " , null";
			}
			if (pubDate != "") {
				query += " , ?";
			} else {
				query += " , null";
			}
			query += " )";

			pstmt = conn.prepareStatement(query);
			pstmt.setString(count, title);
			if (author != "") {
				count++;
				pstmt.setString(count, author);
			}
			if (pubs != "") {
				count++;
				pstmt.setString(count, pubs);
			}
			if (pubDate != "") {
				count++;
				pstmt.setString(count, pubDate);
			}
			System.out.println("[추가하시겠습니까? = y]\n(그만하려면 아무키나 누르세요)");
			System.out.print(">> ");
			yn = in.nextLine();
			switch (yn) {
			case "Y":
			case "y":
				pstmt.executeUpdate();
				System.out.println("[추가되었습니다]");
				break;
			default:
				System.out.println("[중단하였습니다]");
				break;
			}

			/*
			 * query = ""; query += " insert into librarys "; query +=
			 * " values (null, ?, ?, ?, ?)";
			 * 
			 * 
			 * pstmt = conn.prepareStatement(query);
			 * 
			 * 
			 * if (title != "" && author != "" && pubs != "" && pubDate != "") {
			 * pstmt.setString(1, title); pstmt.setString(2, author); pstmt.setString(3,
			 * pubs); pstmt.setString(4, pubDate); }
			 */
		} catch (SQLException e) {
			System.out.println(e);
		}
		close();
	}

	/****************************************
	 * 책 삭제
	 */
	public void bookDelete() {
		getConnection();
		count = 1;
		try {
			System.out.print("삭제할 책 번호 입력 >> ");
			bookId = in.nextInt();
			in.nextLine();
			query = "";
			query += "delete from librarys where book_id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bookId);

			System.out.println("[수정하시겠습니까? = y]\n(그만하려면 아무키나 누르세요)");
			System.out.print(">> ");
			yn = in.nextLine();
			switch (yn) {
			case "Y":
			case "y":
				pstmt.executeUpdate();
				System.out.println("[삭제되었습니다]");
				break;
			default:
				System.out.println("[중단하였습니다]");
				break;
			}

			bookIdSetting();
		} catch (SQLException e) {
			System.out.println(e);
		}
		close();
	} // bookDelete()

	/****************************************
	 * 책번호 재정렬
	 */
	public void bookIdSetting() {
		getConnection();
		count = 1;
		try {
			query = "ALTER TABLE librarys AUTO_INCREMENT=?";

			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, 1);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e);
		}
		close();
	}

	/****************************************
	 * 책 수정
	 */
	public void bookUpdate() {
		getConnection();
		try {
			bookVo = new BookVo();

			System.out.print("수정할 책 번호 입력 (건너뛰기:enter)>> ");
			bookId = in.nextInt();
			in.nextLine();
			System.out.print("책이름 >> ");
			title = in.nextLine();
			System.out.print("작가 >> ");
			author = in.nextLine();
			System.out.print("출판사 >> ");
			pubs = in.nextLine();
			System.out.print("출판일 >> ");
			pubDate = in.nextLine();

			query = "";
			query += " update librarys  ";
			query += " set book_id = ? ";
			if (title != "") {
				query += " ,title = ? ";
			}
			if (author != "") {
				query += " ,author = ? ";
			}
			if (pubs != "") {
				query += " ,pubs = ? ";
			}
			if (pubDate != "") {
				query += " ,pub_date = ? ";
			}
			query += " where book_id = ? ";
			pstmt = conn.prepareStatement(query);

			pstmt.setInt(count, bookId);
			if (title != "") {
				count++;
				pstmt.setString(count, title);
			}
			if (author != "") {
				count++;
				pstmt.setString(count, author);
			}
			if (pubs != "") {
				count++;
				pstmt.setString(count, pubs);
			}
			if (pubDate != "") {
				count++;
				pstmt.setString(count, pubDate);
			}
			count++;
			pstmt.setInt(count, bookId);
			// System.out.println(query);
			System.out.println("[수정하시겠습니까? = y]\n(그만하려면 아무키나 누르세요)");
			System.out.print(">> ");
			yn = in.nextLine();
			switch (yn) {
			case "Y":
			case "y":
				pstmt.executeUpdate();
				System.out.println("[수정되었습니다]");
				break;
			default:
				System.out.println("[중단하였습니다]");
				break;
			}

		} catch (SQLException e) {
			System.out.println(e);
		}
		close();
	} // bookUpdate()

	/****************************************
	 * 책 검색
	 */
	public void bookFind(String type) {
		getConnection();
		bookList = new ArrayList<BookVo>();
		boolean find = false;
		String str = "";
		try {
			query = "";
			query += " select l.book_id, title, author, pubs, pub_date,";
			query += " 	   case when (rent_date is null) or (rent_date is not null and return_date is not null) then '대여가능'";
			query += " 		    else '대여중' end 'state'";
			query += " from librarys l left join rents r";
			query += " on l.book_id = r.book_id";

			if ("title".equals(type)) {
				query += " where title like ? ";
				System.out.println("제목을 입력하세요");
				System.out.print(">> ");
				str = in.nextLine();
			} else if ("id".equals(type)) {
				query += " where book_id like ? ";
				System.out.println("책번호를 입력하세요");
				System.out.print(">> ");
				str = in.nextLine();
				in.nextLine();
			} else if ("author".equals(type)) {
				query += " where author like ? ";
				System.out.println("작가를 입력하세요");
				System.out.print(">> ");
				str = in.nextLine();
			}
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, "%" + str + "%");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// System.out.println(query);
				find = true;
				bookId = rs.getInt("book_id");
				title = rs.getString("title");
				author = rs.getString("author");
				pubs = rs.getString("pubs");
				pubDate = rs.getString("pub_date");

				bookVo = new BookVo(bookId, title, author, pubs, pubDate);
				bookList.add(bookVo);
			}
			System.out.println("────────────────📔 검색결과 📔───────────────");
			if (find == true) {
				System.out.println(
						"┌───────────────────────────────────────────────────────────────────────────────────────┐");
				System.out.println(String.format("│%s\t│%-10s\t│%-10s\t│%-10s\t│%-10s\t│%-10s\t│", "책번호", "제목", "작가",
						"출판사", "출판일", "상태"));
				System.out.println(
						"├───────────────────────────────────────────────────────────────────────────────────────┤");
				for (int i = 0; i < bookList.size(); i++) {
					bookList.get(i).showBook("list");
				}
				System.out.println(
						"└───────────────────────────────────────────────────────────────────────────────────────┘");
			} else {
				System.out.println("[검색결과 없음]");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		close();
	}

}
