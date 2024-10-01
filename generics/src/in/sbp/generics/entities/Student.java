package in.sbp.generics.entities;

public class Student implements Comparable<Student>{

	private int rollNO;
	private String name;
	public Student() {
		
	}
	public Student(int rollNO, String name) {
		super();
		this.rollNO = rollNO;
		this.name = name;
	}
	public int getRollNO() {
		return rollNO;
	}
	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNO=" + rollNO + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		
		return this.rollNO-o.rollNO;
	}
	
	
}
