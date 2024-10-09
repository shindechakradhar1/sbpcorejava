package in.sbp.collections.comparators;

import java.util.Comparator;

import in.sbp.collections.entities.Employee;

public class EmployeeNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
