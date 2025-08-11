package String;

import java.util.Scanner;

public class NumberStringToNumber {
	public static void main(String[] args) {
		String s = new String();
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		if(number(s)==0)
			System.out.println("Not a number string");
		else
			System.out.println(number(s));
	}
	
	public static long number(String s)
	{
		long num=0;
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)>='0'&&s.charAt(i)<='9'))
			{
				return 0;
			}
			else
			{
				num=num*10+(s.charAt(i)-48);
			}
		}
		return num;
	}
}
