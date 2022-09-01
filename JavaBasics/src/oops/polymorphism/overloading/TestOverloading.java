package oops.polymorphism.overloading;

public class TestOverloading {

	public static void main(String[] args) {
		
		Integer i = 20, j = 30;
		addition(i,j);
		
	}

	public static void addition(int a, int b) {
		System.out.println("addition(int a, int b) invoked");
		System.out.println(a+b);
	}
	
	public static void addition(int a, int b, int c) {
		System.out.println("addition(int a, int b, int c) invoked");
		System.out.println(a+b+c);
	}
		public static void addition(int a) {
			System.out.println("addition(int a) invoked");
			System.out.println(a);
		}	
}
