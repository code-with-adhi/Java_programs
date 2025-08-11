package String;
import java.util.Scanner;

public class ConvertToTitleCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s = sc.nextLine();
		
		 String[] words = s.trim().split(" ");
		 String title ="";
		 for(int i=0;i<words.length;i++)
		 {
			if(words[i]!=null)
				title+=(Character.toUpperCase(words[i].charAt(0)))+(words[i].substring(1).toLowerCase())+(" ");
		 }
		 System.out.println(title);
	}
}



