
package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Remove {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al.remove(2));
		//Index out of bounds Exception
		//System.out.println(al.remove(4)); 
		//System.out.println(al.get(4));
		//al.add(4,50);
		System.out.println("Check City present in Arraylist or not:");
		ArrayList<String> places = new ArrayList<String>();
		places.add("Chennai");
		places.add("Anna Nagar");
		places.add("Thirumangalam");
		places.add("Thirumullaivoyal");
		places.add("Thiruchendur");
		places.add("Banglore");
		places.add("Delhi");
		places.add("Mumbai");
		places.add("Tirunelveli");
		places.add("Kolkata");
		
		String place = "Kolkata";
		if(places.remove(place))
			System.out.println("City is found");
		else
			System.out.println("City not found");
		
		String key = "Peyanvilai";
		if(places.remove(key))
			System.out.println("City is found");
		else
			System.out.println("City not found");
		
		
		System.out.println("Remove student object: ");
		ArrayList<Student> stu = new ArrayList<Student>();
		stu.add(new Student(101,"AAA"));
		stu.add(new Student(102,"BBB"));
		stu.add(new Student(103,"CCC"));
		stu.add(new Student(104,"DDD"));
		stu.add(new Student(105,"EEE"));
		Student s = new Student(102,"BBB");
		if(stu.remove(s))
			System.out.println("Removed");
		else
			System.out.println("Not removed");
		
		
		System.out.println("Remove student based on id: ");
		int id=105;
		Student st = null;
		for(int i=0;i<stu.size();i++)
		{
			Student a= stu.get(i);
			if(a.id==id)
				{
				st=a;
				System.out.println(st);
				break;
				}
		}
		if(stu.remove(st))
			System.out.println("Removed");
		else
			System.out.println("Not found");
		
		ArrayList<Student> stu1 = new ArrayList<Student>();
		stu1.add(new Student(101,"AAA"));
		stu1.add(new Student(102,"BBB"));
		stu1.add(new Student(103,"CCC"));
		stu1.add(new Student(104,"AAA"));
		stu1.add(new Student(105,"EEE"));
		String name = "AAA";
		ArrayList<Student> stu2 = new ArrayList<Student>();
		System.out.println("Remove all: ");
		for(int i=0;i<stu1.size();i++)
		{
			Student stud = stu1.get(i);
			if(stud.name.equals(name))
				stu2.add(stud);
		}
		if(stu1.removeAll(stu2))
			{
			System.out.println("Removed");
			System.out.println(stu1);
			}
		else
			System.out.println("Not removed");
		
		
		ArrayList<Student> stu3 = new ArrayList<Student>();
		stu3.add(new Student(101,"AAA"));
		stu3.add(new Student(102,"BBB"));
		stu3.add(new Student(103,"CCC"));
		stu3.add(new Student(104,"AAA"));
		stu3.add(new Student(105,"EEE"));
		String name1 = "AAA";
		ArrayList<Student> stu4 = new ArrayList<Student>();
		System.out.println("Retain all: ");
		for(int i=0;i<stu3.size();i++)
		{
			Student stud = stu3.get(i);
			if(stud.name.equals(name1))
				stu4.add(stud);
		}
		if(stu3.retainAll(stu4))
			System.out.println(stu3);
		
		
		
		
		
	}

}
