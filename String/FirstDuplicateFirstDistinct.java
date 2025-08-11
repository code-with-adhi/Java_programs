package String;
import java.util.Scanner;


public class FirstDuplicateFirstDistinct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		char[] sarr = s.toCharArray();
		distinct(sarr);
		duplicate(sarr);
	}
	public static void distinct(char[] sarr)
	{
		for(int i=0;i<sarr.length;i++)
		{
			int count=0;
			for(int j=0;j<sarr.length;j++)
			{
				if(sarr[i]==sarr[j])
					count++;
			}
			if(count==1)
			{
				System.out.println("First Distict: "+sarr[i]);
				break;
			}
		}
	}
	public static void duplicate(char[] sarr)
	{
		for(int i=0;i<sarr.length;i++)
		{
			int count=0;
			for(int j=0;j<sarr.length;j++)
			{
				if(sarr[i]==sarr[j])
					count++;
			}
		
		if(count>1)
		{
		System.out.println("First Duplicate: "+sarr[i]);
		break;
		}
		}
	}

}
