package in.sbp.networkbill.classes;

public class Airtel implements BillGenerator{

	@Override
	public float generateBill(int networkUsage) {
		return networkUsage * 8;
	}
}
