package in.sbp.methodoverloading.classes;

public class Diagrams{
	
//	final float PI = 3.14f;
	private int radius;
	private int height;
	private int width;
	
	public Diagrams() {}
	
	public Diagrams(int radius) {
		radius=radius;
	}
	
	public Diagrams(int height, int width) {
		this.height=height;
		this.width=width;
	}
	
	
	public static void area(int radius) {
		System.out.println("Area of Circle: " + (3.14*radius*radius));
	}
	
	private void area(int rad, String name) {
		
	}
	
	
	public void area(int number1, float number2) {
		System.out.println("first int second float");
	}
	
	public void area(float number1, int number2) {
		System.out.println("first float second int");
	}
	
	
	
//	public void area(int height, int width) {
//		System.out.println("Area of Rectangle: " + (height*width));
//	}
	
	public void printHeightWidth() {
		System.out.println("height: " + height );
		System.out.println("width: " + width );
	}
	
	
	
}
