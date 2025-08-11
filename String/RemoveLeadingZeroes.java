package String;
import java.util.Scanner;

public class RemoveLeadingZeroes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.next();
		int index=0;
		while(index<s.length() && s.charAt(index)=='0')
			index++;
		System.out.println(s.substring(index));
		
	}

}
