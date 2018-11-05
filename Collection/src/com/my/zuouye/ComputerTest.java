package com.my.zuouye;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
/**
 * @author 丫丫
 *	用一个HashMap来存放笔记本：
	1. 创建一个笔记本类Computer：它的成员变量有 编号(String isbn)、品牌(String brand)、生产日期(Date proDate)、价格(double)。
	2. 创建五个笔记本，以编号(isbn)为唯一标识存放到HashMap中。
	3. 遍历出所有的笔记本类信息。
 */
public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Computer04> h1 = new HashMap<>();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			h1.put("001", new Computer04("001", "惠普",sim.parse("2000-02-03")));
			h1.put("002", new Computer04("002", "联想", sim.parse("1999-09-11")));
			h1.put("003", new Computer04("003", "宏碁", sim.parse("1998-03-15")));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//通过key遍历value
		System.out.println("===============通过key遍历value=====================");
		
		Set<String> set = h1.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			System.out.println(h1.get(it.next()));
		}
		//直接遍历value
		System.out.println("====================直接遍历value=======================");
		Collection<Computer04> col = h1.values();
		for (Iterator<Computer04> iterator = col.iterator(); iterator.hasNext();) {
			Computer04 computer04 = (Computer04) iterator.next();
			System.out.println(computer04);
		}
		//同时遍历key,value
		System.out.println("=====================同时获取键值对=================");
		Set<Entry<String,Computer04>> en = h1.entrySet();
		for (Entry<String, Computer04> entry : en) {
			System.out.println(entry);
		}
	}

}
