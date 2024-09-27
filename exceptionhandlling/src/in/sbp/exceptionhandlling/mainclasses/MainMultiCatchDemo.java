package in.sbp.exceptionhandlling.mainclasses;



import in.sbp.exceptionhandlling.classes.MultiCatchDemo1;

public class MainMultiCatchDemo {

	public static void main(String[] args) {
		MultiCatchDemo1 multiCatch = null;
		try {
			multiCatch.printTable(17);
			try {
				
			} catch (Exception e) {
			}
		}catch(InterruptedException ex) {
			ex.printStackTrace();
			try {
				
			} catch (Exception e) {
			}
		}catch(NullPointerException ex) {
			System.out.println("exception Catched");
			
		}finally {
			try {
				
			} catch (Exception e) {
			}
		}
		System.out.println("next statement");
	}
}
