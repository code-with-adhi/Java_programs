package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortBasedOnNumberOfWords {
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Welcome");
		al.add("I am");
		al.add("How are you");
		Comparator<String> c = new SentenceLengthComparator();
		Collections.sort(al,c);
		System.out.println(al);
		
		
	}

}
