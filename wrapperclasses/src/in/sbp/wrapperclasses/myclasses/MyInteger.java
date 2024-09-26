package in.sbp.wrapperclasses.myclasses;

import java.util.ArrayList;

public class MyInteger {

	public static void main(String[] args) {
//		int result=Integer.compare(13, 13);
//		if(result>0) {
//			System.out.println("First Value is Greater than second Value");
//		}else if(result==0) {
//			System.out.println("Both Values are equal");
//		}else {
//			System.out.println("Second Value is Greater than first Value");
//		}
		
		System.out.println("Max limit for int type is: " + Character.MAX_VALUE);
		System.out.println("Min limit for int type is: " + Double.MIN_VALUE);
		
		Integer number1=10;
		Integer number2=20;
		
		int result = number1 + number2;
		
		System.out.println(result);
		getResult(result, result);
		
		
		ArrayList<Integer> aList = new ArrayList();
		
		aList.add(10);
		aList.add(100);
		aList.add(1000);
		aList.add(10000);
		aList.add(100000);
		aList.add(1000000);
		
		System.out.println(aList);
	}
	
	public static void getResult(int number1, int number2) {
		System.out.println(number1 + "  " + number2);
	}
	
	
}
