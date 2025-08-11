package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class RemoveElementsLessThanN {
	public static void main(String[] args) {
		int n = 5; 
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(4, 2, 7, 3, 8, 1));
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext())
		{
			Integer num = li.next();
			if(num<n)
				li.remove();
		}
		System.out.println(al);
	}

}
