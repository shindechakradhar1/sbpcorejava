package in.sbp.overriding.MainOverriding;

import in.sbp.overriding.subclass.Child;
import in.sbp.overriding.subclass.Child1;
import in.sbp.overriding.superclass.Parent;

public class MainChildParent {

	public static void main(String[] args) {
		Parent parent = new Parent();
		
		Child child = new Child();
		
		Parent parent1 = new Child();
		
		parent1.wakeUp();
		parent.wakeUp();
		
		parent=new Child1();
		
		parent.wakeUp();
		
		parent1=new Child1();
		parent1.wakeUp();
//		Child child1 = (Child)new Parent();
		
//		parent.wakeUp();
		
//		child.sleeps();
//		
//		child.wakeUp();
	}
}
