package String;
import java.util.Scanner;

public class ReverseLettersOfEveryWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		
		String[] sarr = s.trim().split(" ");
		String res="";
		for(int i=0;i<sarr.length;i++)
		{
			String reversedWord = "";
            for (int j = sarr[i].length() - 1; j >= 0; j--) {
                reversedWord += sarr[i].charAt(j);
            }
            res += reversedWord + " ";
		}
		System.out.println(res);
	}

}
