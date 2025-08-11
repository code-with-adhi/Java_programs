package String;

import java.util.Scanner;

public class RemoveDuplicateLettersInGivenString {
	public static void main(String[] args) {
		String s = new String();
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		char[] res = new char[s.length()];
		int pos=0;
		for(int i=0;i<s.length();i++)
		{
			boolean found = false;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					{found=true;
				break;}
			}
			if(!found)
				res[pos++]=s.charAt(i);
		}
		String result = new String(res);
		System.out.println(result);
	}

}
