package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class LaragestElement {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(10,24,13,84,26,83,244,5));
		ListIterator<Integer> li = al.listIterator();
		int max  = Integer.MIN_VALUE;
		while(li.hasNext())
		{
			Integer num = li.next();
			if(num>max)
				max=num;
		}
		System.out.println(max);
	}

}
