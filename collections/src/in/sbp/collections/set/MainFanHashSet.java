package in.sbp.collections.set;

import java.util.HashSet;
import java.util.Set;

import in.sbp.collections.entities.Fan;

public class MainFanHashSet {

	public static void main(String[] args) {
		Set<Fan> fanSet = new HashSet<>();
		
		String brand = "Bajaj";
		
		fanSet.add(new Fan(3, 3, brand));
		fanSet.add(new Fan(3, 3, brand));
		fanSet.add(new Fan(3, 1, brand));
		fanSet.add(new Fan(3, 4, brand));
		fanSet.add(null);
		
		fanSet.stream().forEach(System.out::println);
		
		System.out.println(new Fan(3, 3, brand).hashCode());
		System.out.println(new Fan(3, 3, brand).hashCode());
	}
}
