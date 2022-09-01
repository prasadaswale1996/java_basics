package com.pro.wings.basics;

public class BlocksDemo2 {
	
	public BlocksDemo2()	//no arg constructor
	{
		System.out.println("inside no arg constructor!!!");
	}
	
	{	//instance block
		System.out.println("inside instance block2 !!!");
	}
	
	{	//instance block
		System.out.println("inside instance block1 !!!");
	}
	
	static	//static block
	{
		System.out.println("inside static block1!!!");
	}
	
	static	//static block
	{
		System.out.println("inside static block2!!!");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method started!!!");
		BlocksDemo2 obj1 = new BlocksDemo2();
		BlocksDemo2 obj2 = new BlocksDemo2();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println("main method ended!!!");
		
	}

}
