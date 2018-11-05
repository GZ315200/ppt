package com.my.zuouye;
/**
 * @author 丫丫
 *	创建一个动物类，
	1.它的成员变量有 String name, String fulcolor, double weight
	2.此类重写toString()方法，
	3.重写hashCode()方法和equals()方法
	4.创建3个动物对象，放置到HashSet中，再把它遍历出来。
	5.创建3个动物对象，放置到ArrayList中，再用for把它遍历出来
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
