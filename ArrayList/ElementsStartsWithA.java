package ArrayList;
import java.util.ArrayList;

public class ElementsStartsWithA {
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hello");
		al.add("Apple");
		al.add("Aspire");
		al.add("Ball");
		al.add("Attitude");
		al.add("Ant");
		al.add("Zebra");
		
		for(int i=0;i<al.size();i++)
		{
			String s = al.get(i);
			if(s.charAt(0)!='A' && s.charAt(0)!='a')
			{
				al.remove(s);
			}
		}
		System.out.println(al);
 	}
}
