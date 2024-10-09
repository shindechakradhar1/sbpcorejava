package in.sbp.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> intArrayList = new ArrayList<>();
//		ArrayList<Integer> intArrayList = new ArrayList<>();
		
		
		if(intArrayList.add(1)) {
			System.out.println("Data Added successfully..");
		}
		intArrayList.add(2);
		intArrayList.add(3);
		intArrayList.add(3);
		intArrayList.add(4);
		intArrayList.add(4);
		intArrayList.add(5);
		intArrayList.add(5);
		intArrayList.add(5);
		
		
		
		
		System.out.println(intArrayList);
		
		
		Integer element=intArrayList.get(0);
		
		List<String> stringList = new ArrayList<>();
		
		stringList.add("ABC");
		stringList.add("BBC");
		stringList.add("CBC");
		stringList.add("BAC");
		stringList.add("BCA");
		System.out.println(stringList.toString());
		
////		traditional For loop
//		for(int i=0;i<stringList.size();i++) 
//			System.out.println(stringList.get(i));
//			
////		Advance For Loop
//		for(int number:intArrayList)
//			System.out.println(number);
//		
//		Iterating ArrayList using Traditional for loop
		for(int i=0;i<intArrayList.size();i++)
			System.out.println(intArrayList.get(i));
		
//		Iterating ArrayList using advanced for loop
		for(Integer val:intArrayList)
			System.out.println(val);
		
//		forEach method;
//		intArrayList.forEach(val->System.out.println(val));
		intArrayList.forEach(System.out::println);
		
//		stream api
		intArrayList.stream().forEach(System.out::println);
		
//		performing operation on ArrayList using stream api
		intArrayList.stream().map(Integer::toBinaryString)
						.forEach(System.out::println);
		
//		Iterator cursor
		Iterator<Integer> intIterator=intArrayList.iterator();
		while(intIterator.hasNext()) {
			System.out.println(intIterator.next());
		}
		
		int number1=intArrayList.get(4);
		Integer removeElement = 5;
		
		// by index and by object(element) removeIf(Predicate)
		intArrayList.remove(1);
		System.out.println(intArrayList);
		
//		replace the Element @ specified position
		intArrayList.set(2, 10);
		System.out.println(intArrayList);
		
		
		// add Element by index and element / by element
		intArrayList.add(3, 12);
		System.out.println(intArrayList);
		
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		
		intList.addAll(intArrayList);
		
		System.out.println(intArrayList);
		
		int[] intArray = {1,2,3,4,5};
		printArray(intArray);
		
		
		int index=intArrayList.indexOf(5);
		int lastIndex = intArrayList.lastIndexOf(5);
		System.out.println(intArrayList);
		System.out.println(index);
		System.out.println(lastIndex);
		
		
		
//		Creating subList from ArrayList Using 
		List<Integer> subList = intArrayList.subList(5, intArrayList.size()-2);
		
		System.out.println(subList);
		
		
	}
	
	public static void printArray(int... arr) {
		System.out.println(Arrays.toString(arr));
		
	}
}
