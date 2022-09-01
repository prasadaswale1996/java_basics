package com.pro.wings.basics;

public class MethodDemo {

	public static void main(String[] args) {
		System.out.println("main method started!!!");
		int i=10;
		int j=20;
		int sum= i+j;
		System.out.println("sum="+sum);
		
		printHello(); //method invocation...
		System.out.println("main method ended!!!");
	}
	public static void printHello() //method declaration...
	{
		System.out.println("printHello metod started");
	addition(30,50); //method calling...
	System.out.println("printHello method ended");
	}
	
	public static void addition(int a, int b)
	{
		System.out.println("addition method started!!");
		int result =  a + b;
		System.out.println("result="+result);
		System.out.println("addition method ended!!");
	}
	
	
}
