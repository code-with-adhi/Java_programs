package ArrayList;
import java.util.ArrayList;
import java.util.ListIterator;

public class DisplayInReverse {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("John");
		al.add("Emma");
		al.add("Lucas");
		al.add("Sophia");
		ListIterator<String> li = al.listIterator();
		while(li.hasNext())
		{
			li.next();
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
