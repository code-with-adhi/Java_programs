package String;

import java.util.Arrays;

public class LongestPalindromeInStringArray {
	public static void main(String[] args) {
		String[] s = {"malayalam","racecar","dad","level","mom","radar"};
		System.out.println(Arrays.toString(s));
		int max = Integer.MIN_VALUE;
		String longestPalindrome = "";
		for (String str : s) {
	            int length = palindromeCheck(str);
	            if (length > max) {
	                max = length;
	                longestPalindrome = str;
	            }
	        }
		System.out.println(longestPalindrome);
		
	}
	public static int palindromeCheck(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1+=s.charAt(i);
			
		}
		if(s.equals(s1))
			return s.length();
		else
			return 0;
	}

}
