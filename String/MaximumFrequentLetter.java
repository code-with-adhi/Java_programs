package String;
import java.util.Scanner;

public class MaximumFrequentLetter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.println("Enter the string: ");
		s = sc.next();
		int max = Integer.MIN_VALUE;
		char ch=' ';
		for(int i=0 ; i<s.length();i++)
		{
			int temp = checkOccurence(s,s.charAt(i));
			if(temp>max)
				{
				max=temp;
				ch=s.charAt(i);
				}
		}
		System.out.println(ch);
		
		
	}
	public static int checkOccurence(String s,char c)
	{
		int count=0;
		for(int i=0 ; i<s.length() ; i++)
		{
			if(c==s.charAt(i))
			{
				count++;
			}
		}
		return count;
	}

}
