package exception;

public class CustomException {

	public static void main(String[] args) {

		try {
			isValidAge(17);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static boolean isValidAge(int age) throws InvalidAgeException {
		if (age >= 18)
			return true;
		else
			throw new InvalidAgeException();
		
	}

}
