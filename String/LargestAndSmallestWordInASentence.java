package String;
import java.util.Scanner;

public class LargestAndSmallestWordInASentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s = sc.nextLine();
		
		 String[] words = s.split(" ");
	        
	        String smallest = words[0];
	        String largest = words[0];
	        for(int i=0;i<words.length;i++)
	        {
	        	if(words[i].length()<smallest.length())
	        		smallest=words[i];
	        	else if(words[i].length()>largest.length())
	        		largest=words[i];
	        }
	        
	        System.out.println("Smallest word: " + smallest);
	        System.out.println("Largest word: " + largest);
	}

}
