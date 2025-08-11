package String;
import java.util.Scanner;

public class AlphabetsNumbersSpecialCharCount {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		int alphabet=0,number=0,special=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' && s.charAt(i)<='z'))
				alphabet++;
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
				number++;
			else
				special++;
		}
		System.out.println("Alphabet count: "+alphabet);
		System.out.println("Number count: "+number);
		System.out.println("Special Characters: "+special);
	}

}
