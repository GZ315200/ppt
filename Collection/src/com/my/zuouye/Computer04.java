package com.my.zuouye;

import java.util.Date;

/**
 * @author ѾѾ
 *	��һ��HashMap����űʼǱ���
	1. ����һ���ʼǱ���Computer�����ĳ�Ա������ ���(String isbn)��Ʒ��(String brand)����������(Date proDate)���۸�(double)��
	2. ��������ʼǱ����Ա��(isbn)ΪΨһ��ʶ��ŵ�HashMap�С�
	3. ���������еıʼǱ�����Ϣ��
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
