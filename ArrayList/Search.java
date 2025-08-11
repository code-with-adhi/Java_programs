package ArrayList;

import java.util.ArrayList;

public class Search {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee> ();
		al.add(new Employee("AAA",101));
		al.add(new Employee("BBB",102));
		al.add(new Employee("AAA",103));
		al.add(new Employee("DDD",104));
		
		Employee key = new Employee("BBB",102);
		System.out.println(al.contains(key));
		System.out.println(al.indexOf(key));
		
		int id=104;
		System.out.println(al.contains(id));//Logical Error
		System.out.println("Search employee based on id");
		boolean flag=false;
		for(int i=0;i<al.size();i++)
		{
			Employee e =al.get(i);
			if(e.id==id)
			{
				flag=true;
				break;
			}	
		}
		if(flag)
			System.out.println("true");
		else
			System.out.println("false");
		
		String name ="AAA";
		ArrayList<Employee> arr = new ArrayList<Employee>();
		System.out.println("Search employee based on name");
		for(int i=0;i<al.size();i++)
		{
			Employee e =al.get(i);
			if(e.name.equals(name))
			{
				arr.add(e);
			}
		}
		System.out.println(arr);
		
		
		
	}

}
