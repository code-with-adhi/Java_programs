package String;
import java.util.Scanner;

public class CompressStringPartTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.println("Enter String: ");
		s = sc.next();
		
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			if(arr[i]!=Character.MIN_VALUE)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
					arr[j]=Character.MIN_VALUE;
					count++;
					}
					else
						break;
				}
				System.out.print(arr[i]+""+count);
			}
		}
		
	}

}
