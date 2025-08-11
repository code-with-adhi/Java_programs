package ArrayList;
import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveNegativeIntegers {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(-5);
		al.add(20);
		al.add(-15);
		al.add(30);
		al.add(-25);
		
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext())
		{
			if(li.next()<0)
			{
				li.remove();
			}
		}
		System.out.println(al);
	}

}
