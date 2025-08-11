package String;

import java.util.Scanner;

public class CheckNumberString {
	public static void main(String[] args) {
		String s = new String();
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		if(checkNumber(s)==true)
			System.out.println("Number String");
		else
			System.out.println("Not a number String");
		
	}
	public static boolean checkNumber(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)>='0'&&s.charAt(i)<='9'))
				return false;
		}
		return true;
	}

}
