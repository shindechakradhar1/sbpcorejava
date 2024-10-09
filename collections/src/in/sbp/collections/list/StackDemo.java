package in.sbp.collections.list;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;

import in.sbp.collections.entities.Employee;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack<Employee> employeeList = new Stack<>();
		
		
//		push method to utilize stack architecture
		employeeList.push(new Employee(1,"ABC"));
		employeeList.push(new Employee(2,"ABC"));
		employeeList.push(new Employee(3,"ABC"));
		employeeList.push(new Employee(4,"ABC"));
		
		
//		
//		Employee poppedEmployee=employeeList.pop();
//		System.out.println(poppedEmployee);
//		
//		if(employeeList.isEmpty())
//		try {
//			System.out.println(employeeList.pop());
//			System.out.println(employeeList.pop());
//			System.out.println(employeeList.pop());
//			System.out.println(employeeList.pop());
//			System.out.println(employeeList.pop());
//			System.out.println(employeeList.pop());
//		}catch(EmptyStackException ex) {
//			System.out.println("Stack is Empty..");
//		}
//		
//		System.out.println(employeeList.size());
//		
		List<Employee> empList1 = new ArrayList<>();
//		
//		System.out.println(employeeList);
//		
		while(!employeeList.empty()) {
			empList1.add(employeeList.pop());
		}
//		
		System.out.println(empList1);
//		
//		Queue<Employee> eQueue = new PriorityBlockingQueue<>();
//		
 	}

}
