package bridgelabz;

public class InvalidException extends Exception {
	private String message;
    InvalidException(String message) {
    	super(message);
    }
}
