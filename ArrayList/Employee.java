package ArrayList;

public class Employee {
	String name;
	int id;
	public Employee(String name, int id) 
	{
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return (this.id==e.id && this.name.equals(e.name));
	}
	

}
