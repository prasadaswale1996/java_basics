package exception;

public class arithmaticException {

	public static void main(String[] args) throws ArithmeticException {

		int a=10;
		int b=0;
//		int c= a/b;
		
		
		try {
			int c= a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e){
			System.out.println("can't divide by zero");
		}
		
		
	}

}
