package String;
import java.util.Scanner;

public class ReplaceStringCharToGivenChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.next();
		System.out.println("Enter character from string to replace: ");
		char ch = sc.next().charAt(0);
		System.out.println("Enter character to replace: ");
		char replace = sc.next().charAt(0);
		
		String res="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=ch)
			{
				res+=s.charAt(i);
			}
			else
			{
				res+=replace;
			}
		}
		System.out.println(res);
		
	}

}
