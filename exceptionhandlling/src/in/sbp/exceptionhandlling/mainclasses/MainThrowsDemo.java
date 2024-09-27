package in.sbp.exceptionhandlling.mainclasses;

import java.text.ParseException;

import in.sbp.exceptionhandlling.classes.ThrowsDemo;

public class MainThrowsDemo {

	public static void main(String[] args) {
		ThrowsDemo throwsDemo = new ThrowsDemo();
		try {
			System.out.println(throwsDemo.getDate("2024.01.24"));
		}catch(ParseException ex) {
			System.out.println("Invalid Date Format");
			ex.printStackTrace();
		}
		
		System.out.println("Continued...");
	}
}
