package in.sbp.exceptionhandlling.classes;

public class ThrowDemo {

	public void division(int number1, int number2) {
		if(number2==0)
			throw new ArithmeticException("Second number can not be Zero");
		else
			System.out.println("Division: " + (number1/number2));
	}
	
	public void setName(String name) throws Exception {
		if(name.matches("[A-Z][a-z]{2,14}"))
			System.out.println("Valid Name");
		else
			throw new Exception("Invalid Name");
			
	}
}
