package in.sbp.exceptionhandlling.exceptions;


public class DemoException extends RuntimeException {


	public DemoException() {
		super();
	}

	public DemoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DemoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DemoException(String message) {
		super(message);
	}

	public DemoException(Throwable cause) {
		super(cause);
	}

	
}
