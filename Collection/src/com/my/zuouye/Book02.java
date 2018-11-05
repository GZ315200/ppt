package com.my.zuouye;

import java.util.Date;

/**
 * @author ѾѾ
 * ��һ��	HashMap		�����ͼ�飺
1. ����һ��ͼ����Book�����ĳ�Ա������ ���(String isbn)������(String title)��
      ������(String author)����������(Date pubDate)���۸�(double)��
2. �����屾ͼ�飬�Ա��(isbn)ΪΨһ��ʶ��ŵ�HashMap�С�
3. ���������е�ͼ����Ϣ��
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
