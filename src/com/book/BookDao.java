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
	private String title, author, pubs, pubDate, state;

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
						"┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println(String.format("┃%s\t┃%-10s\t┃%-10s\t┃%-10s\t┃%-10s\t┃%-10s\t┃", "책번호", "제목", "작가",
						"출판사", "출판일", "상태"));
				System.out.println(
						"┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
				for (int i = 0; i < bookList.size(); i++) {
					bookList.get(i).showBook("list");
				}
				System.out.println(
						"┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			} else if ("update".equals(list)) {
				System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println(
						String.format("┃%s\t┃%-10s\t┃%-10s\t┃%-10s\t┃%-10s\t┃", "책번호", "제목", "작가", "출판사", "출판일"));
				System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
				for (int i = 0; i < bookList.size(); i++) {
					bookList.get(i).showBook("update");
				}
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
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
			query += " insert into librarys values ";
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
			System.out.println(query);

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
			pstmt.executeUpdate();
			System.out.println(query);

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
			System.out.println(query);
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
			//System.out.println(query);

			System.out.println("count : " + count);
			pstmt.executeUpdate();
			System.out.println("[수정되었습니다]");

		} catch (SQLException e) {
			System.out.println(e);
		}
		close();
	} // bookUpdate()

}
