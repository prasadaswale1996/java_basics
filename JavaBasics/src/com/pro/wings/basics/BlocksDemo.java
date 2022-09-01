package com.pro.wings.basics;

public class BlocksDemo {
	//instance block
	{
		System.out.println("inside instance block!!!");
	}
	
	static //static block
	{
		System.out.println("inside static block!!!");
	}
	
	public BlocksDemo() //no arg constructor
	{
		System.out.println("inside no arg constructor!!!");
	}
	
	
	
	
	public static void main(String[] args) {

		System.out.println("main method started!!!");
		BlocksDemo obj = new BlocksDemo();
		System.out.println(obj);
		System.out.println("main method ended!!!");
	}

}
