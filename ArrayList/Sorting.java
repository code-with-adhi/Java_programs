package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		//sort(list)
		ArrayList<String> al = new ArrayList<String>();
		al.add("DAA");
		al.add("CBB");
		al.add("BCC");
		al.add("aaDD");
		Collections.sort(al);
		System.out.println(al);	
	}

}
