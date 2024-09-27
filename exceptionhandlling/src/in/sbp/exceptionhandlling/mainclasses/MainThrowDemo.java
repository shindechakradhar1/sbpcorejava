package in.sbp.exceptionhandlling.mainclasses;

import in.sbp.exceptionhandlling.classes.ThrowDemo;

public class MainThrowDemo {

	public static void main(String[] args) {
		ThrowDemo throwDemo = new ThrowDemo();
		throwDemo.division(0, 1);

		try {
			throwDemo.setName("Abdc");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Continued..");
	}
}
