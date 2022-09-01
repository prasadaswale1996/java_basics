package com.pro.wings.basics.loops;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int marks = 80;
	
	String result = "";
	String resultusingTernaryOperator = "";
	
	
	if(marks >= 80)
	{
		result = "First Class";
		//System.out.println("First class");
	}
	else
	{
		result = "Not First Class";
	}
		
	resultusingTernaryOperator = (marks>=80)? "First Class" : "Not First Class"; //Ternary operator
		
	
		System.out.println("result ="+result );
		System.out.println("resultusingTernaryOperator="+resultusingTernaryOperator);
	}

}
