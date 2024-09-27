package in.sbp.exceptionhandlling.mainclasses;

import in.sbp.exceptionhandlling.exceptions.DemoException;

public class MainDemoException {

	public static void main(String[] args) {
		try {
			int number1 =10/0;
		}catch(ArithmeticException ex) {
//			throw new DemoException("This is custom exception");
			throw new DemoException("This is custom message", ex, true, true);
		}
	}
}
