package com.my.zuouye;
/**
 * @author ѾѾ
 *	����һ�������࣬
	1.���ĳ�Ա������ String name, String fulcolor, double weight
	2.������дtoString()������
	3.��дhashCode()������equals()����
	4.����3��������󣬷��õ�HashSet�У��ٰ�������������
	5.����3��������󣬷��õ�ArrayList�У�����for������������
 */
public class Animal03 {

	private String name;
	private String fulcolor;
	private double weight;
	
	public Animal03(String name, String fulcolor, double weight) {
		this.name = name;
		this.fulcolor = fulcolor;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Animal03 [name=" + name + ", fulcolor=" + fulcolor + ", weight=" + weight + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fulcolor == null) ? 0 : fulcolor.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Animal03 other = (Animal03) obj;
		if (fulcolor == null) {
			if (other.fulcolor != null)
				return false;
		} else if (!fulcolor.equals(other.fulcolor))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	
	
}
