package String;
import java.util.Scanner;

public class CheckPrefixSuffixInStringArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size = sc.nextInt();
		System.out.println("Enter array elements: ");
		String[] arr = new String[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		int count=0;
		for(int i=1;i<size;i++)
		{
			if(checkPrefixAndSuffix(arr[0],arr[i]))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean checkPrefixAndSuffix(String str1, String str2)
	{
		return str2.startsWith(str1) && str2.endsWith(str1);
	}

}
