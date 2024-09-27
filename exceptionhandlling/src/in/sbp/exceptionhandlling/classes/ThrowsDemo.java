package in.sbp.exceptionhandlling.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsDemo {

	public Date getDate(String date) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy.mm.dd");
		return dateFormat.parse(date);
	}
}
