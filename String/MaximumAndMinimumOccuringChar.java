package String;
import java.util.Scanner;

public class MaximumAndMinimumOccuringChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.next();
		char[] sarr =s.toCharArray();
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		char maxValue=' ',minValue=' ';
		for(int i=0;i<sarr.length;i++)
		{
			int charCount=0;
			for(int j=0;j<sarr.length;j++)
			{
				if(sarr[i]==sarr[j])
					charCount++;
			}
			if(charCount>max)
			{
				max=charCount;
				maxValue=sarr[i];
			}
			if(charCount<min)
			{
				min=charCount;
				minValue=sarr[i];
			}
		}
		System.out.println("Maximum Occuring: "+maxValue);
		System.out.println("Minimum Occuring: "+minValue);
	}

}
