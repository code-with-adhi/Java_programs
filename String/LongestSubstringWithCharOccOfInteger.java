package String;
import java.util.Scanner;

public class LongestSubstringWithCharOccOfInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String: ");
		String s = sc.next();
		System.out.println("Number: ");
		int k = sc.nextInt();
		substring(s,k);
	}
	public static void substring(String s,int k)
	{
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(frequencyCheck(s.substring(i, j),k))
				{
					if(s.substring(i, j).length()>max)
						max=s.substring(i, j).length();
				}
			}
		}
		System.out.println(max);
	}
	public static boolean frequencyCheck(String s,int k)
	{
		int[] freq =new int[26];
		char[] arr = s.toCharArray();
		for(char c: arr)
			freq[c-'a']++;
		for(char c: arr)
		{
			if(freq[c-'a']<k)
				return false;
		}
		return true;
	}

}
