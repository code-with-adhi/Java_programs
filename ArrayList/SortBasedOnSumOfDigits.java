package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortBasedOnSumOfDigits {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(34);
		al.add(23);
		al.add(56);
		al.add(18);
		Comparator<Integer> c = new SumDigitsCompare();
		Collections.sort(al,c);
		System.out.println(al);
		
		
	}

}
