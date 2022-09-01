package com.pro.wings.basics.abstraction;

public class StudentInfoPrint {

	public static void main(String[] args) {
		
		StudentInfo s1= new StudentInfo();
		
		System.out.println(s1.name);
		System.out.println(s1.roll);
		
		StudentInfo s2= new StudentInfo(10, "Ram");
		
		System.out.println(s2.name);
		System.out.println(s2.roll);

	}
	
}
