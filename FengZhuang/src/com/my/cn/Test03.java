package com.my.cn;
/*
 * 有一张无限大,厚度为1毫米的纸，问经过几次折叠后能够达到珠峰的 高度（8848米）。 
 */
public class Test03 {

	public static void main(String[] args) {
		long result=1;
		int i=1;

		while(result < 8488000){
			result *= 2;
			System.out.print(i+" ");
			i++;
			System.out.println(result);
			
		}
		
	}

	
}
