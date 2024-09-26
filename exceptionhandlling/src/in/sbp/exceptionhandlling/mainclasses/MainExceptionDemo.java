package in.sbp.exceptionhandlling.mainclasses;

import java.text.ParseException;

import in.sbp.exceptionhandlling.classes.ExceptionDemo;

public class MainExceptionDemo {

	public static void main(String[] args) {
		ExceptionDemo demo = new ExceptionDemo();
		
		demo.division(10, 1);
		
		demo.loadClass();
		
		try {
			System.out.println(demo.formatDate("26.09.2024"));
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
//		demo.outOfBound(new int[] {1,2,3,4});
		try {
		demo.outOfBound(1,2,3,4);
		}catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
		
		demo.stringIndexOutOfBound("Shubham");
	}
}
