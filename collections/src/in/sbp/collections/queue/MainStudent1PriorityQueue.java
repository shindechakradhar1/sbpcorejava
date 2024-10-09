package in.sbp.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import in.sbp.collections.entities.Student1;

public class MainStudent1PriorityQueue {

	public static void main(String[] args) {
//		Student1Comparator nameComparator = new Student1Comparator();
		Comparator<Student1> rollNoComparator =(obj1, obj2) -> obj1.getRollNo()-obj2.getRollNo();
		Comparator<Student1> nameComparator =(obj1, obj2) -> obj1.getName().compareTo(obj2.getName());
		Comparator<Student1> ageComparator =(obj1, obj2) -> obj1.getAge()-obj2.getAge();
		Queue<Student1> studentQueue = new PriorityQueue<>((obj1, obj2) -> obj1.getAge()-obj2.getAge());
		
		studentQueue.offer(new Student1(1,"Shubham", 19));
		studentQueue.offer(new Student1(2,"Divya", 18));
		studentQueue.offer(new Student1(3,"Pankaj", 20));
		studentQueue.offer(new Student1(4,"Pragati", 19));
		
		Student1 student1=studentQueue.poll();
		System.out.println(student1);
		System.out.println(studentQueue.poll());
		System.out.println(studentQueue.poll());
		System.out.println(studentQueue.poll());
	}
}
