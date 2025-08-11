package String;
import java.util.HashSet;
import java.util.Scanner;

public class CountLongestSubstringWithoutDuplicate {
//Sliding Window
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String: ");
		String s = sc.next();
		int i=0,j=0,max=Integer.MIN_VALUE;
		HashSet<Character> set = new HashSet<Character>();
		while(i<s.length())
		{
			if(!set.contains(s.charAt(i)))
			{
				set.add(s.charAt(i));
				if(set.size()>max)
					max=set.size();
			}
			else
			{
				while(set.contains(s.charAt(i)))
				{
					set.remove(s.charAt(j));
					j++;
				}
				set.add(s.charAt(i));
			}
			i++;
		}
		System.out.println(max);
		
	}
}
