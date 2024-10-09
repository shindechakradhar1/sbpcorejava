package in.sbp.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		Integer[] intArray = {1,2,3,4,5};
		List<Integer> intList1 =Arrays.asList(intArray);
		
		
		List<String> stringList = new ArrayList<>();
		
		Collections.addAll(stringList,"BBC","ABC","DBC");
		
//		Initial Capacity
		List<Integer> intList = new ArrayList<>();
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(4);
		intList.add(4);
		intList.add(4);
		intList.add(2);
		intList.add(3);
		intList.add(3);
		
		
//		Add T... element into collection object 
		Collections.addAll(intList1, 1,2,3,4,5);
		System.out.println(intList1);
		
//		reverse the Collection Object
		Collections.reverse(intList);
		System.out.println(intList); 
		
//		shuffles the collection of Element in random order
		Collections.shuffle(intList);
		System.out.println(intList);
		
//		rotate the element by n position clockwise
		System.out.println(intList);
		Collections.rotate(intList, 1);
		System.out.println(intList);
		
//		Search last occurence of an Element from collection using binary 
//		search technique and return 
//		negative index if element not found
		int index=Collections.binarySearch(intList, 4);
		System.out.println(index);
		
//		finds out max value from collection of Element
		int max=Collections.max(intList);
		System.out.println(max);
		
//		finds out min value from collection of Element
		int min=Collections.min(intList);
		System.out.println(min);
		
		
	}
}
