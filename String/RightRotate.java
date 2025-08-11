package String;
import java.util.Scanner;

public class RightRotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.next();
		char[] arr = s.toCharArray();
		System.out.println("Enter number of shifts: ");
		int shift = sc.nextInt();
		
		for(int i=0;i<shift;i++)
		{
			char last = arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println(new String(arr));
	}

}
