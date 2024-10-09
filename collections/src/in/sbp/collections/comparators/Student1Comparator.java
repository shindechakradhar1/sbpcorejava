package in.sbp.collections.comparators;

import java.util.Comparator;

import in.sbp.collections.entities.Student1;

public class Student1Comparator implements Comparator<Student1>{

	@Override 
	public int compare(Student1 student1, Student1 student2) {
//		return student1.getRollNo()-student2.getRollNo();
//		return Integer.compare(student1.getRollNo(),student2.getRollNo());
		return student1.getName().compareTo(student2.getName());
	}
}
