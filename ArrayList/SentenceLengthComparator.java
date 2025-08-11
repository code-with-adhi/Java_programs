package ArrayList;

import java.util.Comparator;

public class SentenceLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		String[] arr1 = o1.trim().split(" ");
		String[] arr2 = o2.trim().split(" ");
		return arr1.length-arr2.length;
	}

}
