package in.sbp.methodoverloading.mainclasses;

import in.sbp.methodoverloading.classes.Diagrams;

public class MainDiagram {

	public static void main(String[] args) {
//		Diagrams diagram1 =
//		new Diagrams(10,5);
//		Diagrams diagram2 =
//				new Diagrams(10);
//		
////		diagram1.area();
//		
////		diagram1.area(20,30);
//		
////		diagram2.area(40);
//		
//		diagram2.area(30,40);
//		
//		diagram1.area(10, 10);
//		diagram1.area(10, 10);
		
//		byte number1=(byte)130;
//		
//		System.out.println(number1);
		
		int intVariable=1000;
		// implicit type cast(widening)
		float floatVariable = intVariable;
		
		System.out.println(floatVariable);
		
		
		intVariable = (int)floatVariable;
		
	}
}
