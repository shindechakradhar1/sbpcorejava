package in.sbp.arithmeticoperation.project;

import java.util.Scanner;

import in.sbp.arithmeticoperation.project.classes.ArithmeticOperationUtility;
import in.sbp.arithmeticoperation.project.exceptions.InvalidUserInputException;
import in.sbp.arithmeticoperation.project.exceptions.NegativeUserInputException;

public class App {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);) {
			int choice;
			do {
				System.out.println("Enter your choice");
				System.out.println("----------------------------------------------------------------------------------");
				System.out.println("1. Addition");
				System.out.println("2. Substraction");
				System.out.println("3. Multiplication");
				System.out.println("4. Division");
				System.out.println("0. Exit");
				choice = scanner.nextInt();
				switch (choice) {
				case 1 -> {
					try {
						ArithmeticOperationUtility.addition(scanner);
					} catch (NegativeUserInputException ex) {
						ex.printStackTrace();
					}
				}
				case 2 -> ArithmeticOperationUtility.substraction(scanner);
				case 3 -> ArithmeticOperationUtility.multiplication(scanner);
				case 4 -> {
					try {
						ArithmeticOperationUtility.division(scanner);
					} catch (InvalidUserInputException e) {
						System.out.println(e.getMessage());
					}
				}
				case 0 -> System.out.println("Bye..");
				default -> System.out.println("Invalid Input.. try again");
				}
			} while (choice != 0);

		}
	}

}
