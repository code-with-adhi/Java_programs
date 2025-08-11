package ArrayList;
import java.util.ArrayList;

public class ReverseEachNumber {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(101);
		al.add(123);
		al.add(23);
		al.add(765);
		ArrayList<Integer> revList = new ArrayList<Integer>();
		for(int i=0;i<al.size();i++)
		{
			int rev=0;
			Integer num = al.get(i);
			while(num>0)
			{
				int rem = num%10;
				rev = rev * 10 + rem;
				num/=10;
			}
			revList.add(rev);
		}
		System.out.println(revList);
	}

}
