package com.pro.wings.basics.abstraction;

public class StudentInfo extends Student {

	public StudentInfo() {
		super();
		System.out.println("inside no arg of StudentInfo!!!");
	}
	
	public StudentInfo(int roll, String name) {
		super(roll, name);
//		this.roll=roll;
//		this.name=name;
		
	}
	
	public void printStudentInfo() {
		System.out.println("inside print method");
	}
	
}
