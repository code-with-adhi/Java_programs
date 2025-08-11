package String;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		String s = new String();
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		if(palindromeCheck(s).equals(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	public static String palindromeCheck(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1+=s.charAt(i);
		}
		return s1;
	}
	

}
