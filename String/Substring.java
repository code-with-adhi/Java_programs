package String;

import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.println("Enter string: ");
		s = sc.next();
		
		for(int i=0;i<s.length();i++)
		{
			String s1="";
			for(int j=i;j<s.length();j++)
			{
				s1+=s.charAt(j);
				System.out.println(s1);
			}
		}
	}

}
