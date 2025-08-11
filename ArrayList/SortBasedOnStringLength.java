package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortBasedOnStringLength {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Annish Jerina");
		al.add("Abinaya");
		al.add("Harini");
		al.add("Hema Hamsaveni");
		Comparator<String> c = new StringComparator();
		Collections.sort(al,c);
		System.out.println(al);
	}

}
