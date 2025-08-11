package String;

import java.util.Scanner;

public class SwapString {
	public static void main(String[] args) {
		String s1 = new String();
		String s2 = new String();
		System.out.println("Enter the strings: ");
		Scanner sc = new Scanner(System.in);
		s1 = sc.next();
		s2 = sc.next();
		int len = s1.length();
		s1=s1.concat(s2);
		s2=s1.substring(0,len);
		s1=s1.substring(len);
		System.out.println(s1);
		System.out.println(s2);
	}
}
