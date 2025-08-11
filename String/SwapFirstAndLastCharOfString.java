package String;

import java.util.Scanner;

public class SwapFirstAndLastCharOfString {
	public static void main(String[] args) {
		String s = new String();
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		System.out.println(swap(s));
		
	}
	public static String swap(String s)
	{
			if (s.length() <= 1) {
	            return s;
			}
	        return s.charAt(s.length() - 1) + s.substring(1, s.length() - 1) + s.charAt(0);
	    }
	}

