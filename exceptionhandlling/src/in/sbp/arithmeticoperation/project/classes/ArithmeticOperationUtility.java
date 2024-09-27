package in.sbp.arithmeticoperation.project.classes;

import java.util.Scanner;

import in.sbp.arithmeticoperation.project.exceptions.InvalidUserInputException;
import in.sbp.arithmeticoperation.project.exceptions.NegativeUserInputException;

public class ArithmeticOperationUtility {

	public static void addition(Scanner scanner) throws NegativeUserInputException {
		System.out.println("Enter Fist number");
		int number1=scanner.nextInt();
		System.out.println("Enter Fist number");
		int number2=scanner.nextInt();
		if(number1<0 || number2<0)
			throw new NegativeUserInputException("Number should be Positive");
		else
			System.out.println("Addition result: " + (number1+number2));
	}
	public static void substraction(Scanner scanner) {
		
	}
	public static void multiplication(Scanner scanner) {
		
	}
	public static void division(Scanner scanner) throws InvalidUserInputException {
		System.out.println("Enter Fisrt value: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter Second value: ");
		int number2 = scanner.nextInt();
		try {
			System.out.println("Result of Division is: " + (number1/number2));
		}catch(ArithmeticException ex) {
			throw new InvalidUserInputException("Second value can not be 0", ex);
		}
		
	}
}
