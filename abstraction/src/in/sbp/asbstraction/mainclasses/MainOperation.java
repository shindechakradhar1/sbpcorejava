package in.sbp.asbstraction.mainclasses;

import in.sbp.asbstraction.classes.Operation;
import in.sbp.asbstraction.classes.Transaction;

public class MainOperation {

	public static void main(String[] args) {
//		Operation operation = new Operation(10000);
//		operation.debitAmount(100);
//		operation.checkBalance();
//		
//		operation.creditAmount(1000);
//		operation.checkBalance();
		
		Transaction transaction= new Operation(10000);
		
		transaction.creditAmount(1000);
		
		transaction.debitAmount(2000);
		
	}
}
