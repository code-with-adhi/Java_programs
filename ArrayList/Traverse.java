package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traverse {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		Iterator<Integer> it = al.iterator();
//      Cannot reuse same object multiple times
//		System.out.println(it.next()); 10
//		System.out.println(it.next()); 20
//		System.out.println(it.next()); 30
//		System.out.println(it.next()); 40
//		System.out.println(it.hasNext()); false
//		//System.out.println(it.next()); NoSuchElementException
		System.out.println("--------------------------------");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student(102,"Abi"));
		s.add(new Student(107,"Annie"));
		s.add(new Student(117,"Harini"));
		s.add(new Student(118,"Hema"));
		Iterator<Student> it1 = s.iterator();
		System.out.println("--------------------------------");
		while(it1.hasNext())
		{
			System.out.println(it1.next());
			//s.add(new Student(118,"Hema")); ConcurrentModificationException
		}
		
		ListIterator<Student> li = s.listIterator();
		System.out.println("--------------------------------");
		while(li.hasNext())
			System.out.println(li.next());
		System.out.println("--------------------------------");
		while(li.hasPrevious())
			System.out.println(li.previous());
		ListIterator<Student> li1 = s.listIterator(2);
		System.out.println("--------------------------------");
		while(li1.hasNext())
			System.out.println(li1.next());
		System.out.println("--------------------------------");
		for(int a : al)
			System.out.println(a);
		
	}

}
