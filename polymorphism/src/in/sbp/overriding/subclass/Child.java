package in.sbp.overriding.subclass;

import in.sbp.overriding.superclass.Parent;

public class Child extends Parent {

	public void sleeps() {
		System.out.println("Child sleeps @03:00 AM");
	}

	public void wakeUp() {
		System.out.println("Child wokes up @ 10:00 AM");
//		return null;
	}
}
