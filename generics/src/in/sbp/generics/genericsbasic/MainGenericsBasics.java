package in.sbp.generics.genericsbasic;

import java.util.ArrayList;
import java.util.List;

public class MainGenericsBasics {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>(); 
		
		arrayList.add("ABC");
		arrayList.add("BBC");
		arrayList.add("CBC");
		arrayList.add("DBC");
		arrayList.add("EBC");
		
		String stringVar = arrayList.get(2);
//		float stringVar= (Float) arrayList.get(0);
		
		
		
	}
	
	public void getData(Object... data) {
		
		float val= (Float)data[2]; 
		
		// no compile time error
		float val1 = (Float) data[0];
		
		System.out.println(val1);
	}
	
}
