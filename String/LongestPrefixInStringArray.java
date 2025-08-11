package String;
import java.util.Scanner;

public class LongestPrefixInStringArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size =sc.nextInt();
		String[] sarr = new String[size];
		for(int i=0;i<sarr.length;i++)
		{
			sarr[i]=sc.next();
		}
		
		String first = sarr[0];
		String prefix ="";
		for(int i=0;i<first.length();i++)
		{
			int count=1;
			char ch=sarr[0].charAt(i);
			for(int j=1;j<sarr.length;j++)
			{
				if(i<sarr[j].length() && first.charAt(i)==sarr[j].charAt(i))
					count++;
			}
			if(count==sarr.length)
				prefix+=ch;
			else 
				break;
					
				}
		System.out.println(prefix);
	}
	}

