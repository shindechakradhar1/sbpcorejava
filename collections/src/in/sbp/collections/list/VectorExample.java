package in.sbp.collections.list;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import in.sbp.collections.entities.Employee;

public class VectorExample {

	public static void main(String[] args) {
//		
		Employee emp = new Employee(101,"ABC");
		
		List<Employee> employeeList = new Vector<>();
		
		employeeList.add(new Employee(8,"ABC"));
		employeeList.add(new Employee(9,"BBC"));
		
		
		List<Employee> employeeList1 = Arrays.asList(
				new Employee(2,"EMP2"),
				new Employee(3,"EMP3"),
				new Employee(4,"EMP4"),
				emp
		);
		
		
//		
//		Employee emp1=employeeList.get(0);
//		System.out.println(emp1);
//		
//		employeeList.addAll(employeeList1);
//		
//		employeeList.remove(1);
//		
//		employeeList.removeIf(e->e.getName().equals("EMP3"));
//		
//		employeeList.forEach(System.out::println);
		
//		retainsAll(removes element from this list 
//		which are not present in another list
//		
		employeeList.retainAll(employeeList1);
		
		System.out.println(employeeList);
		
//		boolean test(T t)
		
		System.out.println(employeeList1);
		
//		employeeList1.removeIf( obj-> obj.getName().equals("ABC"));
		
		System.out.println(employeeList1);
		
		
		
	}
}
