package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Add {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10,20,30);
//		li.add(10);
//		li.remove(20);
		System.out.println(li);
		List<Integer> al = new ArrayList<>(Arrays.asList(10,20,30));
		al.add(40);
		al.remove((Integer)10);
		System.out.println(al);
		
	}

}
