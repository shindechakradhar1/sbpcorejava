package in.sbp.collections.entities;

import java.util.Objects;

public class AMovies implements Comparable<AMovies>{
	private String year;
	private String name;
	private String role;

	public AMovies() {}

	public AMovies(String year, String name, String role) {
		this.year = year;
		this.name = name;
		this.role = role;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public int compareTo(AMovies other) {
		return other.role.compareTo(this.role);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		
		if(this.getClass()!=obj.getClass())
			return false;
		
		AMovies temp = (AMovies)obj;
		
		return temp.year.equals(this.year) 
				&& temp.name.equals(this.name) 
				&& temp.role.equals(this.role);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(year, name, role);
	}
	

	@Override
	public String toString() {
		return "year=" + year + ", name=" + name + ", role=" + role;
	}

}
