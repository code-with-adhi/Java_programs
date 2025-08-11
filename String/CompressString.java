package String;
import java.util.Scanner;

public class CompressString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.println("Enter string: ");
		s = sc.next();
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=Character.MIN_VALUE)
			{
				int count=1;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
					arr[j]=Character.MIN_VALUE;
					count++;
					}
				}
				System.out.print(count+""+arr[i]);
			}
		}
		
	}

}
