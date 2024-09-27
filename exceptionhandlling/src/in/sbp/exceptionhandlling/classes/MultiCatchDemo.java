package in.sbp.exceptionhandlling.classes;

public class MultiCatchDemo {

	private String message;
	
	public MultiCatchDemo() {}

	public MultiCatchDemo(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void division(int number1, int number2){
		System.out.println(number1/number2);
	}

	@Override
	public String toString()  {
		
		return "MultiCatchDemo [message=" + message + "]";
	}
}
