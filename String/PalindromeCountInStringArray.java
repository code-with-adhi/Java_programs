package String;

import java.util.Arrays;

public class PalindromeCountInStringArray {
	public static void main(String[] args) {
		String[] s = {"malayalam","racecar","hello","world","mom"};
		System.out.println(Arrays.toString(s));
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if(palindromeCheck(s[i])==true)
				count++;
		}
		System.out.println(count);
	}
	public static boolean palindromeCheck(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1+=s.charAt(i);
		}
		if(s.equals(s1))
			return true;
		else
			return false;
	}

}
