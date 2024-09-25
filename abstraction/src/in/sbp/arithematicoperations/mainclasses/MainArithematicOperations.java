package in.sbp.arithematicoperations.mainclasses;

import in.sbp.arithematicoperations.interfaces.ArithematicOperations;

public class MainArithematicOperations {

	public static void main(String[] args) {
		ArithematicOperations addition =(operand1,operand2)-> operand1+operand2;
		ArithematicOperations substraction =(operand1,operand2)-> operand1-operand2;
		ArithematicOperations multiplication =(operand1,operand2)-> operand1*operand2;
		ArithematicOperations division =(operand1,operand2)-> operand1/operand2;
		
		
		System.out.println("Addition Result is: " + addition.doOperation(10, 20));
		System.out.println("substraction Result is: " + substraction.doOperation(10, 20));
		System.out.println("multiplication Result is: " + multiplication.doOperation(10, 20));
		System.out.println("division Result is: " + division.doOperation(10, 20));
		
	}
}
