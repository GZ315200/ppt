package com.my.zuouye;
/**
 * @author 丫丫
 *	一：创建一个学生类，
	1.它的成员变量有int sid, String name, int age, double score
	2.此类重写toString()方法，
	3.重写hashCode()方法和equals()方法
	4.创建3个学生对象，放置到HashSet中，再把它遍历出来。
	5.创建3个学生对象，放置到ArrayList中，再用for把它遍历出来
 */
public class Student01 {
	private int sid;
	private String name;
	private int age;
	private double score;
	
	public Student01(int sid, String name, int age, double score) {
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + sid;
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
		Student01 other = (Student01) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
			return false;
		if (sid != other.sid)
			return false;
		return true;
	}
	
	
	

}
