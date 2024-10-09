package in.sbp.collections.entities;

import java.util.Objects;

public class Student implements Comparable<Student>{

	private int id;
	private String name;

	public Student() {}

	public Student(int id, String name) {
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
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj==null)
			return false;
		
		if(obj.getClass()!=this.getClass() )
			return false;
		
		Student tmp = (Student)obj;
		
		return (this.id== tmp.id && this.name.equals(tmp.name));
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return Float.compare(this.id, o.id);
	}

}
