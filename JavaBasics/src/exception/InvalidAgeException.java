package exception;

public class InvalidAgeException extends Exception {

	
	private static String msg = "Invalid age!!!";
	
	public InvalidAgeException() {
		this(msg);
	}

	public InvalidAgeException(String message) {
		super();
	}
	
	
}
