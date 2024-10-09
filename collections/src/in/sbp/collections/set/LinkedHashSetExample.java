package in.sbp.collections.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import in.sbp.collections.entities.Employee;

public class LinkedHashSetExample {

	public static void main(String[] args) {
//		defautl Size 0
		Set<Employee> empLinkedHashSet = new LinkedHashSet<>();
//		intial Capacity
		Set<Employee> empLinkedHashSet1 = new LinkedHashSet<>(10);
//		initial capacity and loadfactor(Float)
		Set<Employee> empLinkedHashSet2 = new LinkedHashSet<>(10, 0.90F);
		
//		boolean add
		empLinkedHashSet.add(new Employee(1,"ABC"));
		empLinkedHashSet.add(new Employee(2,"BBC"));
		empLinkedHashSet.add(new Employee(3,"CBC"));
		empLinkedHashSet.add(null);
		empLinkedHashSet.add(new Employee(4,"DBC"));
		empLinkedHashSet.add(new Employee(5,"EBC"));
		empLinkedHashSet.add(new Employee(6,"FBC"));
		
//		System.out.println(empLinkedHashSet);
		empLinkedHashSet.forEach(System.out::println);
		
//		remove
		empLinkedHashSet.remove(new Employee(6, "FBC"));
		System.out.println(empLinkedHashSet);
		 
//		boolean isEmpty
		System.out.println(empLinkedHashSet.isEmpty());
		
//		boolean contains
		System.out.println(empLinkedHashSet.contains(new Employee(5,"EBC")));

//		toArray
		Employee[] empArray=empLinkedHashSet.toArray(new Employee[0]);
		System.out.println(Arrays.toString(empArray));
		
//		System.out.println();
//		clears all the Element from set object
		empLinkedHashSet.clear();
		System.out.println(empLinkedHashSet);
		
//		int size
		System.out.println(empLinkedHashSet.size());

	}
}
