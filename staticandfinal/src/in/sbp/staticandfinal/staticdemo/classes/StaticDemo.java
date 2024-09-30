package in.sbp.staticandfinal.staticdemo.classes;

public class StaticDemo {
	// local variable / parameterized variable / instance variable / class variable
	public static int staticCounter=0; 
	public int instanceCounter=0;
	
	static {
		staticCounter=0;
	}
	
	public StaticDemo() {
		staticCounter++;
		instanceCounter++;
	}
	
	
	public void printCounterValues() {
		System.out.println("Instance Counter: " + instanceCounter);
		System.out.println("Static Counter: " + staticCounter);
	}
	
	
	
	
	
	
}
