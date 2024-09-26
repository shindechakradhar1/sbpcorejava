package in.sbp.overriding.subclass;

import in.sbp.overriding.superclass.Parent;

public class Child1 extends Parent{

	@Override
	public void wakeUp() {
		System.out.println("Child 1 wakes up @11:00 AM");
	}
}
