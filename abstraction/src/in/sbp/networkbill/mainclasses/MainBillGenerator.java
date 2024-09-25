package in.sbp.networkbill.mainclasses;

import in.sbp.networkbill.classes.Airtel;
import in.sbp.networkbill.classes.BillGenerator;

public class MainBillGenerator {

	public static void main(String[] args) {
		BillGenerator airtel = new Airtel();
		System.out.println("Your Mobile Bill: " + airtel.generateBill(150));
		airtel.method2();
		
		BillGenerator.method3();
//		System.out.println(BillGenerator.number);
	}
}
