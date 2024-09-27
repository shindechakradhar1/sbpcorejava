package in.sbp.arithmeticoperation.project.exceptions;

public class InvalidUserInputException extends Exception {

	public InvalidUserInputException() {
		super();
	}

	public InvalidUserInputException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidUserInputException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidUserInputException(String message) {
		super(message);
	}

	public InvalidUserInputException(Throwable cause) {
		super(cause);
	}

}
