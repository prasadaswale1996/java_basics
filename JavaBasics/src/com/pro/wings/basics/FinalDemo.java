package com.pro.wings.basics;

class Employee 
{
	int id ;
	String name;
	
	public Employee(int id, String name) // parameterized constructor
	{this.id = id;
	this.name = name;
	}
}
	
public class FinalDemo{
	
	public static void main(String[] args) {
	int i = 10;
	System.out.println(i);
	i = 20;
	System.out.println(i);
	
	int j = 30;
	i=j;
	System.out.println("after changing reference:"+i);
	System.out.println("=========");	
	
	final Employee e1 = new Employee(10, "Ram");
		System.out.println(e1.id);
		System.out.println(e1.name);
	
		e1.id = 20;
		e1.name = "Sham";
		
		System.out.println("prnt after modification!!!");
		System.out.println(e1.id);
		System.out.println(e1.name);
		
		Employee e2 = new Employee(20, "ABC");
		//e1=e2;
		
	}
}
