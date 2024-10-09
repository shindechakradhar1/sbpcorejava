package in.sbp.collections.entities;

public class Student1 {
	private int rollNo;
	private String name;
	private int age;

	public Student1() {}

	public Student1(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
//	@Override
//	public int compareTo(Student1 obj) {
////		return Integer.compare(obj.rollNo,this.rollNo);
////		return this.name.compareTo(obj.name);
//		return obj.name.compareTo(this.name);
//	}
	

	@Override
	public String toString() {
		return "Student1 [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}

}
