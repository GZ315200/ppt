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
 * @author ѾѾ
 * ��һ��	HashMap		�����ͼ�飺
1. ����һ��ͼ����Book�����ĳ�Ա������ ���(String isbn)������(String title)��
      ������(String author)����������(Date pubDate)���۸�(double)��
2. �����屾ͼ�飬�Ա��(isbn)ΪΨһ��ʶ��ŵ�HashMap�С�
3. ���������е�ͼ����Ϣ��
 */
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap<Book02> h1 = new HashMap<>();
		HashMap<String, Book02> h1 = new HashMap<>();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		try {
			h1.put("001", new Book02("001", "������", "������", sim.parse("2009-01-01"), 23.8));
			h1.put("002", new Book02("002", "��", "��", sim.parse("1994-09-09"), 34));
			h1.put("003", new Book02("003", "�ݷ���", "������", sim.parse("2002-02-03"), 20));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//��Key������value
		System.out.println("==================��Key������value======================");
		Set<String> set = h1.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			//System.out.println(it.next());
			System.out.println(h1.get(it.next()));
		}
		//ֱ�ӱ���value
		System.out.println("====================ֱ�ӱ���value=======================");
		Collection<Book02> l1 = h1.values();
		for (Iterator iterator = l1.iterator(); iterator.hasNext();) {
			Book02 book02 = (Book02) iterator.next();
			System.out.println(book02);
		}
		//ͬʱ��ȡ��ֵ��
		System.out.println("=====================ͬʱ��ȡ��ֵ��=================");
	
		Set<Entry<String,Book02>> set2 = h1.entrySet();
		for (Entry<String, Book02> entry : set2) {
			System.out.println(entry);
		}
	}

}
