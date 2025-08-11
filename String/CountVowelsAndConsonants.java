package String;

import java.util.Scanner;

public class CountVowelsAndConsonants {
	public static void main(String[] args) {
		String s = new String();
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		int vowels=0,consonants=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
			
		}
		System.out.println("Vowels: "+vowels);
		System.out.println("Consonants: "+consonants);
	}

}
