package in.sbp.networkbill.classes;

public interface BillGenerator {
	float generateBill(int internateUsage);
	
//	public void showMessage();
	
//	abstract void method1();
	
	//after java 8/1.8 version
	public default void method2() {
		System.out.println("Hello this is default method");
		method4();
	}
	
	public static void method3() {
		System.out.println("This is Static method");
	}
	
	// after java 14 version
	private void method4() {
		System.out.println("This is private Method");
	}
}
