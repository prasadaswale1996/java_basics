package com.pro.wings.basics.abstraction;

public abstract class Student {	//abstract class
	int roll;
	String name;
	
	public Student()
	{
	super();
	System.out.println("inside no arg constructor!!!");
	}
	
	public Student(int roll, String name) {
		this.roll=roll;
		this.name=name;
	}
	
	public abstract void printStudentInfo();
	
}


//public class StudentInfo extends Student {
//
//	public StudentInfo() {
//		super();
//		System.out.println("inside no arg of StudentInfo!!!");
//	}
//	
//	public StudentInfo(int roll, String name) {
//		super(roll, name);
//		this.roll=roll;
//		this.name=name;
//		
//	}
//	
//	public void printStudentInfo() {
//		System.out.println("inside print method");
//	}
//	
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//		
//		StudentInfo s1= new StudentInfo();
//		
//		System.out.println(s1.name);
//		System.out.println(s1.roll);
//		
//		StudentInfo s2= new StudentInfo(10, "Ram");
//		
//		System.out.println(s2.name);
//		System.out.println(s2.roll);
//
//	}
//	
//}
