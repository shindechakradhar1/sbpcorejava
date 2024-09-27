package in.sbp.arithmeticoperation.project.exceptions;

public class NegativeUserInputException extends Exception {

	public NegativeUserInputException() {
		super();
	}
	
	public NegativeUserInputException(String msg) {
		super(msg);
	}
	
	public NegativeUserInputException(Throwable cause) {
		super(cause);
	}
	public NegativeUserInputException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
}
