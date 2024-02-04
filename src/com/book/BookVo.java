package com.book;

public class BookVo {

	/****************************
	 * Field
	 */
	/** Book **/
	private int bookId;
	private String title, author, pubs, pubDate;
	/** Member **/
	private int MemberNum;
	private String id, pw, name, ph, address;
	/** Rent **/
	private String rentDate, returnDate, state;

	public BookVo() {
		super();
	}

	/***************************
	 * 책추가 생성자
	 * @param bookId
	 * @param title
	 * @param author
	 * @param pubs
	 * @param pubDate
	 */
	public BookVo(int bookId, String title, String author, String pubs, String pubDate) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.pubs = pubs;
		this.pubDate = pubDate;
	}

	/*****************************
	 * BookList 생성자
	 * 
	 * @param bookId
	 * @param title
	 * @param author
	 * @param pubs
	 * @param pubDate
	 * @param state
	 */
	public BookVo(int bookId, String title, String author, String pubs, String pubDate, String state) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.pubs = pubs;
		this.pubDate = pubDate;
		this.state = state;
	}

	/****************************
	 * GetterSetterMethod
	 * 
	 * @return
	 */
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubs() {
		return pubs;
	}

	public void setPubs(String pubs) {
		this.pubs = pubs;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public int getMemberNum() {
		return MemberNum;
	}

	public void setMemberNum(int memberNum) {
		MemberNum = memberNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/***************************
	 * BookList
	 */
	public String toStringBookList() {
		return "[bookId=" + bookId + ", title=" + title + ", author=" + author + ", pubs=" + pubs + ", pubDate="
				+ pubDate + ", state=" + state + "]";
	}

	public void showBook(String list) {
		if ("list".equals(list)) {
			System.out.println(String.format("┃%d\t┃%-10s\t┃%-10s\t┃%-10s\t┃%-10s\t┃%-10s\t┃", bookId, title, author,
					pubs, pubDate, state));
		} else if ("update".equals(list)) {
			System.out.println(
					String.format("┃%d\t┃%-10s\t┃%-10s\t┃%-10s\t┃%-10s\t┃", bookId, title, author, pubs, pubDate));
		}
	}

	/***************************
	 * History
	 */
	public String toStringHistory() {
		return "[bookId=" + bookId + ", title=" + title + ", pubs=" + pubs + ", id=" + id + ", name=" + name
				+ ", rentDate=" + rentDate + ", returnDate=" + returnDate + "]";
	}

}
