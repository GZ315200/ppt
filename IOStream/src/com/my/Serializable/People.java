package com.my.Serializable;

import java.io.Serializable;

public class People implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String uesrname;
	private long no;  //…Ã∆∑±‡∫≈
	private double price;
	private int shuliang;
	
	public People(String uesrname, long no, double price, int shuliang) {
		this.uesrname = uesrname;
		this.no = no;
		this.price = price;
		this.shuliang = shuliang;
	}

	@Override
	public String toString() {
		return "People [uesrname=" + uesrname + ", no=" + no + ", "
				+ "price=" + price + ", shuliang=" + shuliang + "]";
	} 
	
	
	
}
