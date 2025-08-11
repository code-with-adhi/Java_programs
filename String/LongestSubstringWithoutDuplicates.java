package String;
import java.util.Scanner;

public class LongestSubstringWithoutDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String: ");
		String s = sc.next();
		substring(s);
	}
	public static void substring(String s)
	{
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				if(duplicateCheck(s.substring(i, j)))
				{
					if(s.substring(i, j).length()>max)
						max=s.substring(i, j).length();
				}
			}
		}
		System.out.println(max);
	}
	public static boolean duplicateCheck(String s)
	{
		char[] arr = s.toCharArray();
		int charCount=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			if(arr[i]!=Character.MIN_VALUE)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
					count++;
					arr[j]=Character.MIN_VALUE;
					}
				}
			}
			if(count==1)
				charCount++;
		}
		if(charCount==s.length())
			return true;
		else
			return false;
	}

}
