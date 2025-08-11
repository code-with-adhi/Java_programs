package String;
import java.util.Scanner;

public class LeftRotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.next();
		char[] arr = s.toCharArray();
		System.out.println("Enter number of shifts: ");
		int shift=sc.nextInt();
		
		for(int i=0;i<shift;i++)
		{
			char ch = arr[0];
			for(int j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=ch;
		}
		System.out.println(new String(arr));
	}

}
