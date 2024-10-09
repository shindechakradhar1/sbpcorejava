package in.sbp.collections.entities;

import java.util.Objects;

public class Movies implements Comparable<Movies> {

	private int id;
	private String name;

	public Movies() {}

	public Movies(int id, String name) {
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
	public int compareTo(Movies o) {
		return this.name.compareTo(o.name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Movies temp = (Movies)obj;
		
		return (temp.id==this.id && temp.name.equals(this.name)); 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return "Movies [id=" + id + ", name=" + name + "]";
	}

}
