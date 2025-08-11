package String;

import java.util.Scanner;

public class ConcatWithoutPlusOrConcat {
	public static void main(String[] args) {
		String s1 = new String();
		String s2 = new String();
		System.out.println("Enter the strings: ");
		Scanner sc = new Scanner(System.in);
		s1 = sc.next();
		s2 = sc.next();
		
		char[] arr = new char[s1.length()+s2.length()];
		for(int i=0;i<arr.length;i++)
		{
			if(i<s1.length())
				arr[i]=s1.charAt(i);
			else
				arr[i]=s2.charAt(i-s1.length());
		}
		String res = new String(arr);
		System.out.println(res);
	}

}
