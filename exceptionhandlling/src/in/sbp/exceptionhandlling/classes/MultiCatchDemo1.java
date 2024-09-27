package in.sbp.exceptionhandlling.classes;

public class MultiCatchDemo1 {

	public void printTable(int tableNo) throws InterruptedException {
		for(int i=1;i<=10;i++) {
			Thread.sleep(1000);
			System.out.println(tableNo + "*" + i + ": " + i*tableNo);
		}
			
	}
}
