package in.sbp.asbstraction.classes;

public class Operation extends Transaction{

	private int bal;
	
	public Operation(int bal) {
		this.bal=bal;
	}

	@Override
	public void debitAmount(float amount) {
		bal-=amount;
		System.out.println("Your Balance: "  + bal);
	}
	
	@Override
	public void creditAmount(float amount) {
		bal+=amount;
		System.out.println("Your Balance: "  + bal);
	}
	
	public void checkBalance() {
		System.out.println("Your Balance: "  + bal);
	}
	
}
