package in.sbp.generics.maingenericsclasses;

import in.sbp.generics.genericsclasses.GenericUpperBound;

public class MainGenericUpperBound {

	public static void main(String[] args) {
		GenericUpperBound<Integer> intVal = new GenericUpperBound<>();
		intVal.setVal(10);
		System.out.println(intVal.getVal());
	}
}
