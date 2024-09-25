package in.sbp.classes;
public class Car {

	// properties
	private int speed;
	private int steering;
	
	public Car() {
		
	}
	
	public Car(int sp) {
		speed=sp;
	}
	
	public Car(int sp, int str) {
		
	}
	
//	public Car(int str) {
//		
//	}
	
	public void accelarate() {
		speed+=5;
	}
	
	public void applyBreak() {
		speed-=20;
	}
	
	public void printDetails() {
		System.out.println("Current Speed= " + speed + "");
	}
}
