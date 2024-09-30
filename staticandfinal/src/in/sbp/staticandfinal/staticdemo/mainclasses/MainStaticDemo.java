package in.sbp.staticandfinal.staticdemo.mainclasses;

import in.sbp.staticandfinal.staticdemo.classes.StaticDemo;

public class MainStaticDemo {

	static int variable1;
	int variable2;
	
	static{
		variable1=0;
		System.out.println("this is static block");
	}
	//we can access static references(static variable, static method) 
	//from static method without any references(object)
	
	
	// we can not access non static references(instance variable, instance methods)
	// from static method without any references(object)
	public static void main(String[] args) {
//		System.out.println("this is main method()");
//		MainStaticDemo mainStaticDemo = new MainStaticDemo();
//		variable1=10;
//		method2();
//		mainStaticDemo.variable2=10;
//		mainStaticDemo.method1();
		
		StaticDemo staticDemo1 = new StaticDemo();
		staticDemo1.printCounterValues();
		StaticDemo staticDemo2 = new StaticDemo();
		StaticDemo staticDemo3 = new StaticDemo();
		staticDemo3.printCounterValues();
		StaticDemo staticDemo4 = new StaticDemo();
		staticDemo4.printCounterValues();
		StaticDemo staticDemo5 = new StaticDemo();
		staticDemo5.printCounterValues();
		StaticDemo staticDemo6 = new StaticDemo();
		StaticDemo staticDemo7 = new StaticDemo();
		StaticDemo staticDemo8 = new StaticDemo();
		StaticDemo staticDemo9 = new StaticDemo();
		StaticDemo staticDemo10 = new StaticDemo();
		StaticDemo staticDemo11 = new StaticDemo();
		
		staticDemo11.printCounterValues();
		staticDemo1.printCounterValues();
	}
	
	public void method1() {
		method2();
		variable1=10;
	}
	
	public static void method2() {
		System.out.println("Static Method2 ");
	}
}
