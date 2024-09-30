package in.sbp.staticandfinal.finaldemo.classes;

public class ParentFinalClass {

	// lazy initialization
	private final int CONSTANT_VALUE;
	// lazy initialization won't work for static final
	private static final int CONSTANT_VALUE1=100;
	
//	static{
//		CONSTANT_VALUE1=100;
//	}
	
	public ParentFinalClass() {
		CONSTANT_VALUE=10;
	}
	
	public final void method1(){
		System.out.println("parent method 1");
	}
}
