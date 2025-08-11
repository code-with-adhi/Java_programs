package String;
import java.util.Scanner;

public class CountUpperCaseAndLowerCase {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		int upperCount =0, lowerCount =0,count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				upperCount++;
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
				lowerCount++;
			else
				count++;
		}
		System.out.println("Uppercase count: "+upperCount);
		System.out.println("Lowercase count: "+lowerCount);
		System.out.println("Other Characters: "+count);
	}

}
