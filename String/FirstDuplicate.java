package String;
import java.util.Scanner;

public class FirstDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.next();
		char[] arr = s.toCharArray();
		System.out.println(duplicateCheck(arr));
		
		}
	public static char duplicateCheck(char arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					return arr[i];
				}
			}
		}
		return ' ';
	}

}
