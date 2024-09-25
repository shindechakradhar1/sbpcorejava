package in.sbp.abstraction.billgenerator.mainclasses;

import in.sbp.abstraction.billgenerator.classes.Bill;
import in.sbp.abstraction.billgenerator.classes.IndustrialBill;

public class MainBill {

	public static void main(String[] args) {
//		Bill bill=new IndustrialBill();
		
		Bill bill1 = new IndustrialBill();
//		float amount=bill.generateBill(100);
//		System.out.println("your Electricity Bill is: " + amount);
		System.out.println("your Electricity Bill is: " + bill1.generateBill(100));
	}
}
