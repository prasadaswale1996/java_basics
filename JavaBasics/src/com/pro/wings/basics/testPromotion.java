package com.pro.wings.basics;

public class testPromotion {
	//explicit \ implicit promotion
	
	public static void main(String[] args) {
		byte b= 127;
		short s= b;
		
		int i= 3276787;
		short j= (short)i;
		
		System.out.println("Value of byte b=" +b);
		System.out.println("Value of short s=" +s);
		System.out.println("Value of int i =" +i);
		System.out.println("Value of short j =" +j);
	}

}
