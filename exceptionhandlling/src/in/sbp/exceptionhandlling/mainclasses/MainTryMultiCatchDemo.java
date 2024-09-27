package in.sbp.exceptionhandlling.mainclasses;

import in.sbp.exceptionhandlling.classes.MultiCatchDemo;

public class MainTryMultiCatchDemo {

	public static void main(String[] args) {
		MultiCatchDemo multiCatch = new MultiCatchDemo();
		
		try {
			multiCatch.division(10,0);
		}catch(NullPointerException|ArithmeticException ex) {
			System.out.println("Object is null");
		}catch(RuntimeException ex) {
			ex.printStackTrace();
		}
		System.out.println(multiCatch);
	}
}
