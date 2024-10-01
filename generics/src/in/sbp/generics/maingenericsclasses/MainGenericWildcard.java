package in.sbp.generics.maingenericsclasses;

import java.util.ArrayList;
import java.util.List;

public class MainGenericWildcard {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		upperBoundWildCard(intList);
		
		List<Number> numbList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		lowerBoundWildCard(numbList);
		
		List<String> list = new ArrayList<>();
		list.add("10");
		list.add("11");
		list.add("12");
		unBoundWildCard(list);
	}
	
	public static void upperBoundWildCard(List<? extends Number> upperBoundList) {
		upperBoundList.forEach(System.out::println);
	}
	public static void lowerBoundWildCard(List<? super Number> lowerBoundList) {
		for(Object val:lowerBoundList)
			System.out.println(val);
	}
	public static void unBoundWildCard(List<?> unBoundList) {
		for(int i=0;i<unBoundList.size();i++)
			System.out.println(unBoundList.get(i));
	}
}
