package ArrayList;
import java.util.ArrayList;

public class TraverseWithoutIterator {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
	}

}
