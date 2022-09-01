package com.pro.wings.basics;

public class WrapperDemo {

	public static void main(String[] args) {
		int i= 10;
		Integer j= i; //auto boxing
		int k = j;	  //auto unboxing
		
		System.out.println("int i="+i);
		System.out.println("Integer j="+j);
		System.out.println("int k="+k);
	}

}
