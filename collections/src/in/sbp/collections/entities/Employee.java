package in.sbp.collections.entities;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;

	public Employee() {}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

//	@Override
//	public int compareTo(Employee temp) {
//		return this.name.compareTo(temp.name);
//	}
	
//	@Override
	public int compareTo(Employee temp) {

////		int result=0;
////		
////		if(this.id<temp.id)
////			result=-1;
////		if(this.id==temp.id)
////			result=0;
////		if(this.id>temp.id)
////			result=1;
////		return result
		return Integer.compare(this.id, temp.id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj.getClass()!=this.getClass())
			return false;
		
		Employee temp = (Employee)obj;
		
		return  this.name.equals(temp.name)&& this.id==temp.id;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hash=13;		
		hash = hash * 17 + id;
		hash = hash * 17 + name.toLowerCase().hashCode();
//		return Objects.hash(id, name);
//		return hash;
		
		return Objects.hash(id,name);
	}
}
