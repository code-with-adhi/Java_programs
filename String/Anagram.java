package String;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String s1 = new String();
		System.out.println("Enter string 1: ");
		s1 = sc.nextLine();
		String s2 = new String();
		System.out.println("Enter string 2: ");
		s2 = sc.nextLine();
		if(s1.length()==s2.length())
			if(checkAnagram(s1, s2))
				System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
    
    public static boolean checkAnagram(String s1, String s2) 
    {
        char[] ch1 = s1.toCharArray();
        char [] ch2 = s2.toCharArray();
        Arrays.sort(ch1);      
        Arrays.sort(ch2);
        return (Arrays.toString(ch1).equals(Arrays.toString(ch2)));
    }
}

