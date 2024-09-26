package in.sbp.exceptionhandlling.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {

	public int division(int number1, int number2) {
		return number1/number2; 
	}
	
	public void loadClass() {
		try {
			Class.forName("com.mysql.driver.MySqlDriver");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public Date formatDate(String bDay) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("dd.mm.yy");
		return format.parse(bDay);
	}
	
	public void outOfBound(int... arr) {
		System.out.println(arr[arr.length]);
	}
	
	public void stringIndexOutOfBound(String str) {
		System.out.println(str.charAt(str.length()));
	}
}
