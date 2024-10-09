package in.sbp.collections.set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		
		NavigableSet<String> nameSet = new TreeSet<>();
		
		
		nameSet.add("Rutuja");
		nameSet.add("Pratiksha");
		nameSet.add("Rutuja");
		nameSet.add("Neha");
		nameSet.add("Sneha");
		nameSet.add("Amruta");
		nameSet.add("Shubham");
		
		System.out.println(nameSet);
		
		System.out.println(nameSet.first());
		System.out.println(nameSet.last());
		
//		strictly lower than current object or null
		System.out.println(nameSet.lower("Amruta"));
		
//		strictly lower or equal than current object or null
		System.out.println(nameSet.floor("SZubham"));
		
//		strictly higher or equal than current object or null
		System.out.println(nameSet.ceiling("SZubham"));
		
//		strictly higher than current object or null
		System.out.println(nameSet.higher("Neha"));
		
		SortedSet<String> subSet = nameSet.subSet("Neha", "Shubham");
		
		System.out.println(subSet);
		
		SortedSet<String> headSet = nameSet.headSet("Neha");
		
		System.out.println("headSet" + headSet);
		
		SortedSet<String> tailSet = nameSet.tailSet("Rutuja");
		
		System.out.println(tailSet);
		
		
		for(String name:nameSet)
			System.out.println(name.length());
		
		TreeSetExample treeSetExample = new TreeSetExample();
		
		nameSet.forEach(treeSetExample::printString);
		
		Iterator<String> nameIterator=nameSet.iterator();
		
		while(nameIterator.hasNext())
			System.out.println(nameIterator.next().charAt(1));
	}
	
	public void printString(String name) {
		System.out.println("name: " + name + " length: " + name.length());
	}
}
