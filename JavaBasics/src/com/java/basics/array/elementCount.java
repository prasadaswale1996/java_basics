package com.java.basics.array;

import java.util.Arrays;
import java.util.List;

public class elementCount {
	
	public static void main(String[] args) {
		
		int [] num = {3,1,3,4,6,4};
		System.out.println(Arrays.toString(num));
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

		
	}
	
	public void countElement() {

		
		
		int[] num = {1,2,3,4,5,6,7,8,9,0};
		List<int[]> a= Arrays.asList(num);
		System.out.println(a);		
		
		
		
	}
	
	
	
	
}
