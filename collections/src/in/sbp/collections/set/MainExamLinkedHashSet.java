package in.sbp.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

import in.sbp.collections.entities.Exam;

public class MainExamLinkedHashSet {

	public static void main(String[] args) {
		Set<Exam> questionBank = new LinkedHashSet<>();
		
		questionBank.add(new Exam(1,"Question 1",4));
		questionBank.add(new Exam(2,"Question 2",1));
		questionBank.add(new Exam(3,"Question 3",2));
		questionBank.add(new Exam(4,"Question 4",3));
		questionBank.add(new Exam(4,"Question 4",3));
		questionBank.add(new Exam(4,"Question 4",3));
		questionBank.add(new Exam(5,"Question 5",5));
		questionBank.add(new Exam(5,"Question 5",5));
		questionBank.add(new Exam(5,"Question 5",5));
		
//		questionBank.forEach(System.out::println);
		
		Exam[] examArray=questionBank.toArray(new Exam[0]);	
		
		for(int i=0;i<examArray.length;i++)
			System.out.println(examArray[i]);
	}
}
