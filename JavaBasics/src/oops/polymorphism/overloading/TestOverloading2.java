package oops.polymorphism.overloading;

public class TestOverloading2 {
		public static void main(String[] args) {
			
			Integer i = 20;
			int j = 30;
			addition(10,10,10);
			
		}

		public static void addition(int a, int b) {
			System.out.println("addition(int a, int b) invoked");
			System.out.println(a+b);
		}
		
		public static void addition(Integer a, float b, int c) {
			System.out.println("addition(int a, Integer b) invoked");
			//System.out.println(a+b);
		}
		
		public static void addition(Integer a,Integer b, int c) {
			System.out.println("addition(Integer a, Integer b) invoked");
			//System.out.println(a);
	    }	
		
		
	
			
			public static void addition(Integer a, int b) {
				System.out.println("addition(Integer a, int b) invoked");
				System.out.println(a);
			}	
	}

