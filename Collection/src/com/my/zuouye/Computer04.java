package com.my.zuouye;

import java.util.Date;

/**
 * @author 丫丫
 *	用一个HashMap来存放笔记本：
	1. 创建一个笔记本类Computer：它的成员变量有 编号(String isbn)、品牌(String brand)、生产日期(Date proDate)、价格(double)。
	2. 创建五个笔记本，以编号(isbn)为唯一标识存放到HashMap中。
	3. 遍历出所有的笔记本类信息。
 */
public class Computer04 {
	private String isbn;
	private String brand;
	private Date proDate;
	
	public Computer04(String isbn, String brand, Date proDate) {
		this.isbn = isbn;
		this.brand = brand;
		this.proDate = proDate;
	}
	@Override
	public String toString() {
		return "Computer04 [isbn=" + isbn + ", brand=" + brand + ", proDate=" + proDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((proDate == null) ? 0 : proDate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer04 other = (Computer04) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (proDate == null) {
			if (other.proDate != null)
				return false;
		} else if (!proDate.equals(other.proDate))
			return false;
		return true;
	}
	
	
}
