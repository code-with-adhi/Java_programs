package String;
import java.util.Scanner;

public class PermutationsOfAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		permutation(s,"");
	}
	static void permutation(String s,String res)
	{
		if(s.length()==0)
			System.out.println(res);
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			String temp = s.substring(0,i)+s.substring(i+1);
			permutation(temp,ch+res);
			
		}
	}

}
