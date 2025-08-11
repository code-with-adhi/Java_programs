package String;
import java.util.Scanner;

public class ExpandString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.next();
		char[] arr = s.toCharArray();
		String s1="";
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			if(arr[i]>='0' && arr[i]<='9')
			{
				count = count*10+(arr[i]-'0');
				for(int j=0;j<count;j++)
					s1+=arr[i+1];
			}
		}
		System.out.println(s1.toString());
	}
}
		
