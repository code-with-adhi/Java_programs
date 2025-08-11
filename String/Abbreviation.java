package String;
import java.util.Scanner;

public class Abbreviation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		
		String res="";
		res+=s.charAt(0);
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')				
				{
				res+=s.charAt(i);
				}
		}
		System.out.println(res);
	}

}
