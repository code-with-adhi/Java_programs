package String;
import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.println("Enter String: ");
		s = sc.nextLine();
		if (isPangram(s)==1) {
            System.out.println("Pangram.");
        } else {
            System.out.println("NOT a pangram.");
        }
	}
	    public static int isPangram(String sentence) {
	        if (sentence == null) {
	            return 0;
	        }
	        int[] alphabet = new int[26];
	        int count = 0;
	        for (char c : sentence.toCharArray()) {
	            if (c >= 'a' && c <= 'z') {
	                int index = c - 'a';
	                if (alphabet[index]==0) {
	                    alphabet[index] = 1;
	                    count++;
	                }
	            }
	            if (count == 26) 
	            {
	                return 1;
	            }
	        }
	        return 0;
	    }
	 
	}