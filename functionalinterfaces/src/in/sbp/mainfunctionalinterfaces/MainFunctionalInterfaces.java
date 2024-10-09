package in.sbp.mainfunctionalinterfaces;

import java.util.function.Function;
import java.util.function.Predicate;

public class MainFunctionalInterfaces {

	public static void main(String[] args) {
//		Function functional Interface
//		Lamda Expression
		long result1=testFunction(intValue ->  intValue.longValue());
		
		System.out.println(result1);
		
//		method referencing
		long result2=testFunction(Integer::longValue);
		System.out.println(result2);
		
//		Predicate
		
//		Predicate<String> stringPredicate = (String name)-> {
//			System.out.println("this is predicate testing"); 
//			return name.charAt(0)=='A';
//		};
		
//		boolean result=stringPredicate.test("BAC");
		
		boolean booleanResult = testPredicate(name->{
			System.out.println("This is Predicate testing");
			return name.length()<3;
		}, "Tushar");
		
		System.out.println(booleanResult);

	}
	
	public static long testFunction(Function<Integer, Long> obj) {
		return obj.apply(123);
	}
	
	public static boolean testPredicate(Predicate<String> stringPredicate, String msg) {
		return stringPredicate.test(msg);
	}
	
}
