package oops.polymorphism.overloading;

//made by KD sir


public class testOverload3 {
	
	public static void m1(int i,int j,Integer k,float l)
	{
		System.out.println("int-int");
	}
	public static void m1(int j,Integer i,Integer k,int l)
	{
	  System.out.println("int-Integer");	
	}
	public static void m1(int j,int i,Integer k,int l)
	{
	  System.out.println("int-Integer2");	
	}
//	public static void m1(int j,int i,Integer k,int l)
//	{
//	  System.out.println("int-Integer");	
//	}
	public static void m1(Integer i,Integer j)
	{
	  System.out.println("Integer-Integer");	
	}
	public static void main(String[] args) {
		
		Integer a=10;
		m1(10,a,10,10);
	}

}
