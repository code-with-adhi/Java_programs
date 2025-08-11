package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortReverseAlphabeticalOrder {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("banana");
		al.add("pear");
		al.add("kiwi");
		Comparator<String> c = new ReverseStringComparator();
		Collections.sort(al,c);
		System.out.println(al);
	}

}
