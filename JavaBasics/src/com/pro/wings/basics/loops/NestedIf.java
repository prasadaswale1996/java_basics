package com.pro.wings.basics.loops;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {

//		int age =2;
//		int weight = 34;
		
		System.out.println("plese enter donor detail");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int weight = sc.nextInt();
		
	//valid blood donor = age>18 and weight >=50;
		
		if(age>=18)
		{
			if(weight>50)
			{
				System.out.println("valid donor!");
			}
			else
			{
				System.out.println("You can not donate blood due to under weight!!");
			}
		}
		else
		{
			System.out.println("invalid donor : under age!!!");
		}
		
	}

}
