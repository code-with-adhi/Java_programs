package ArrayList;
import java.util.ArrayList;

public class AddElement {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al);
		al.add(10);
		al.add(20);
		al.add("Hello");
		al.add('a');
		al.add(true);
		System.out.println(al);
		
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(null);
		//al1.add("Hello");
		al1.add(30);
		al1.add(10);
		al1.add(null);
		System.out.println(al1);
		
		al.addAll(2,al1);
		System.out.println(al);

	}

}
