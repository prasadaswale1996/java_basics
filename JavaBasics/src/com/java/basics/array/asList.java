package com.java.basics.array;

import java.util.Arrays;
import java.util.List;

public class asList {

	public static void main(String[] args) {
		String [] S = {"A", "B", "C", "D"};
		
		
		List<String> list = Arrays.asList(S);
		
		System.out.println("The list is=" + list);
	}

}
