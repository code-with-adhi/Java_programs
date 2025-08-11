package String;
import java.util.Scanner;

public class DuplicateCharacterCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.next();
		int numcount = 0;
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			if(arr[i]!=Character.MIN_VALUE)
			{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=Character.MIN_VALUE;
				}
			}
			if(count>0)
				numcount++;
			}
		}
		System.out.println(numcount);
	}

}
