package com.my.zuouye;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author 丫丫
 * 用一个	HashMap		来存放图书：
1. 创建一个图书类Book：它的成员变量有 编号(String isbn)、书名(String title)、
      作者名(String author)、出版日期(Date pubDate)、价格(double)。
2. 创建五本图书，以编号(isbn)为唯一标识存放到HashMap中。
3. 遍历出所有的图书信息。
 */
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap<Book02> h1 = new HashMap<>();
		HashMap<String, Book02> h1 = new HashMap<>();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		try {
			h1.put("001", new Book02("001", "人鱼族", "布吉岛", sim.parse("2009-01-01"), 23.8));
			h1.put("002", new Book02("002", "简爱", "简爱", sim.parse("1994-09-09"), 34));
			h1.put("003", new Book02("003", "草房子", "曹文轩", sim.parse("2002-02-03"), 20));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//由Key来遍历value
		System.out.println("==================由Key来遍历value======================");
		Set<String> set = h1.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			//System.out.println(it.next());
			System.out.println(h1.get(it.next()));
		}
		//直接遍历value
		System.out.println("====================直接遍历value=======================");
		Collection<Book02> l1 = h1.values();
		for (Iterator iterator = l1.iterator(); iterator.hasNext();) {
			Book02 book02 = (Book02) iterator.next();
			System.out.println(book02);
		}
		//同时获取键值对
		System.out.println("=====================同时获取键值对=================");
	
		Set<Entry<String,Book02>> set2 = h1.entrySet();
		for (Entry<String, Book02> entry : set2) {
			System.out.println(entry);
		}
	}

}
