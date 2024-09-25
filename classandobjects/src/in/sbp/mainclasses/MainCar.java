package in.sbp.mainclasses;

import in.sbp.classes.Car;

public class MainCar {

	
	public static void main(String[] args) {
		// Default Constructor
		Car car = new Car(100);
		car.applyBreak();
		car.printDetails();
	}
}
