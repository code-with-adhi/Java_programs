package String;
import java.util.Scanner;

public class StringRotationOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = new String();
		System.out.println("Enter String: ");
		s1=sc.next();
		System.out.println("Enter rotated string: ");
		String s2=sc.next();
		char[] arr1=s1.toCharArray();
		int shift = arr1.length;
		boolean flag=false;
		for (int j = 0; j < shift; j++) 
		{
			char[] arr = rotate(arr1);
			if(s2.equals(new String(arr)))
				{
				flag=true;
				break;
				}
		}
		if(flag)
			System.out.println("Rotated");
		else
			System.out.println("Not Rotated");
		
	}
	public static char[] rotate(char[] arr1)
	{
			char temp = arr1[0]; 
	        for (int i = 0; i < arr1.length - 1; i++) 
	        {
	             arr1[i] = arr1[i + 1]; 
	        }
	        arr1[arr1.length - 1] = temp;
	        return arr1;
	}
}

