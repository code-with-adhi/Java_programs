package ArrayList;
import java.util.ArrayList;

public class EmployeeDriver {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("ABC",123));
		al.add(new Employee("AAA",1241));
		al.add(new Employee("ACD",124));
		System.out.println(al);
		System.out.println("Size before adding: "+al.size());
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(new Employee("CCC",1352));
		al1.add(new Employee("VDA",12341));
		al1.add(new Employee("RFD",1424));
		al.addAll(al1);
		System.out.println(al);
		System.out.println("Size after adding: "+al.size());
		System.out.println(al1);
	}

	

}
