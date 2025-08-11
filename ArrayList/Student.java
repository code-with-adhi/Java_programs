package ArrayList;

public class Student {
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return id == s.id && name.equals(s.name);
	}
	
}
