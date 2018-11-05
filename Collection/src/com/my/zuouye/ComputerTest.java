package com.my.zuouye;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
/**
 * @author ѾѾ
 *	��һ��HashMap����űʼǱ���
	1. ����һ���ʼǱ���Computer�����ĳ�Ա������ ���(String isbn)��Ʒ��(String brand)����������(Date proDate)���۸�(double)��
	2. ��������ʼǱ����Ա��(isbn)ΪΨһ��ʶ��ŵ�HashMap�С�
	3. ���������еıʼǱ�����Ϣ��
 */
public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Computer04> h1 = new HashMap<>();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			h1.put("001", new Computer04("001", "����",sim.parse("2000-02-03")));
			h1.put("002", new Computer04("002", "����", sim.parse("1999-09-11")));
			h1.put("003", new Computer04("003", "�곞", sim.parse("1998-03-15")));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ͨ��key����value
		System.out.println("===============ͨ��key����value=====================");
		
		Set<String> set = h1.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			System.out.println(h1.get(it.next()));
		}
		//ֱ�ӱ���value
		System.out.println("====================ֱ�ӱ���value=======================");
		Collection<Computer04> col = h1.values();
		for (Iterator<Computer04> iterator = col.iterator(); iterator.hasNext();) {
			Computer04 computer04 = (Computer04) iterator.next();
			System.out.println(computer04);
		}
		//ͬʱ����key,value
		System.out.println("=====================ͬʱ��ȡ��ֵ��=================");
		Set<Entry<String,Computer04>> en = h1.entrySet();
		for (Entry<String, Computer04> entry : en) {
			System.out.println(entry);
		}
	}

}
