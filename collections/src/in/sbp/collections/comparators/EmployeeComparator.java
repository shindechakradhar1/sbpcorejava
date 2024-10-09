package in.sbp.collections.comparators;

import java.util.Comparator;

import in.sbp.collections.entities.Employee;

public class EmployeeComparator {

	public static Comparator<Employee> nameComparator = 
			(e1,e2)->e1.getName().compareTo(e2.getName());
			
	public static Comparator<Employee> idComparator = 
			(e1,e2)->Integer.compare(e1.getId(), e2.getId());
}
