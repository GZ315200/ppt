package com.my.zuouye;

import java.util.Date;

/**
 * @author 丫丫
 * 用一个	HashMap		来存放图书：
1. 创建一个图书类Book：它的成员变量有 编号(String isbn)、书名(String title)、
      作者名(String author)、出版日期(Date pubDate)、价格(double)。
2. 创建五本图书，以编号(isbn)为唯一标识存放到HashMap中。
3. 遍历出所有的图书信息。
 */
public class Book02 {
	private String isbn;
	private String title;
	private String author;
	private Date pubDate;
	private double price;
	
	public Book02(String isbn, String title, String author, Date pubDate, double price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.pubDate = pubDate;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book02 [isbn=" + isbn + ", title=" + title + ", author=" + author + ", pubDate=" + pubDate + ", price="
				+ price + "]";
	}
	
	

}
