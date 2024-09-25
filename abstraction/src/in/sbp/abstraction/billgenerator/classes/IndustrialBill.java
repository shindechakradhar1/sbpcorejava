package in.sbp.abstraction.billgenerator.classes;

public class IndustrialBill extends Bill{

	
	
	@Override
	public float generateBill(int units) {
//		float amount=units*16.30f;
//		return amount;
		
		return units*16.30f;
	}
}
