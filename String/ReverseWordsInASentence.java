package String;
import java.util.Scanner;

public class ReverseWordsInASentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.nextLine();
		
		String[] sarr = s.trim().split(" ");
		String res="";
		for(int i=sarr.length-1;i>=0;i--)
		{
			res+=sarr[i]+" ";
		}
		System.out.println(res);
	}

}
