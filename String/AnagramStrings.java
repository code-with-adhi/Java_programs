package String;
import java.util.Scanner;

public class AnagramStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = new String();
		System.out.println("Enter string 1: ");
		s1 = sc.next();
		String s2 = new String();
		System.out.println("Enter string 2: ");
		s2 = sc.next();
		if(s1.length()==s2.length())
			checkAnagram(s1,s2);
		else
			System.out.println("Not Anagram");
	}
	
	public static void checkAnagram(String s1, String s2)
	{
		boolean flag=false;
		for(int i=0;i<s1.length();i++)
		{
			int freq1 = frequency(s1,s1.charAt(i));
			for(int j=0;j<s2.length();j++)
			{
					int freq2 = frequency(s2,s2.charAt(j));	
					if(freq1==freq2 && s1.charAt(i)==s2.charAt(j))
						flag=true;
					else
						break;
			}
		}
		if(flag)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}
	
	public static int frequency(String s,char ch)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
				count++;
		}
		return count;
	}
}
