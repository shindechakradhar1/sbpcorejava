package in.sbp.generics.maingenericsclasses;

import in.sbp.generics.entities.Student;
import in.sbp.generics.genericsclasses.GenericUpperBoundSorting;

public class MianGenericUpperBoundSorting {

	public static void main(String[] args) {
		GenericUpperBoundSorting<String> stringSorting = new GenericUpperBoundSorting<>();
		
		stringSorting.setTArray("BBC","ABC","EBC","DBC");
		
		System.out.println("Before Sorting..");
		stringSorting.printTArray();
		
		stringSorting.sortTArray();
		
		System.out.println("After Sorting..");
		stringSorting.printTArray();
		
		GenericUpperBoundSorting<Student> studentSorting = new GenericUpperBoundSorting<>();
		
		studentSorting.setTArray(new Student(3,"ABC"),new Student(1,"BBC"),new Student(2,"DBC"));
		
		System.out.println("Before Sorting..");
		studentSorting.printTArray();
		
		studentSorting.sortTArray();
		
		System.out.println("After Sorting..");
		studentSorting.printTArray();
		
		
	}
}
