package com.java.basics.array;
import java.util.Arrays;

public class RemoveDupArray2 {

	public static void main(String[] args) {
		int [] num = {3,10,5,9,9,10,13,2,2};
		Arrays.sort(num);
		
		removeDuplicate(num);
	}
	
public static int[] removeDuplicate(int[] array) {
	int[] a = new int[array.length-1];
	int j = 0;
	
	for (int i=0; i<a.length-1;i++) 
	{
		if (array[i]==array[i+1] ) {
			continue;
		}
		System.out.println(array[i]);
	}	
		array[j]=array[a.length-1];
		System.out.println(array[j]+ "   ");
		
		return a;
}	
	
}
