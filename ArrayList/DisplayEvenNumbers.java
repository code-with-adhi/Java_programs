package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class DisplayEvenNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		al.add(35);
		al.add(40);
		
		Iterator<Integer> li = al.iterator();
		while(li.hasNext())
		{
			int num = li.next();
			if(num%2==0)
				System.out.println(num);
		}
	}

}
