package String;
import java.util.Scanner;

public class EvenOddLengthWordsInAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		String[] sarr = s.trim().split(" ");
		System.out.println("Even: ");
		for(int i=0;i<sarr.length;i++)
		{
			int length = sarr[i].length();
			if(length%2==0)
				System.out.println(sarr[i]);
		}
		System.out.println("Odd: ");
		for(int i=0;i<sarr.length;i++)
		{
			int length = sarr[i].length();
			if(length%2!=0)
				System.out.println(sarr[i]);
		}
	}

}
