package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RightShiftElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of shifts:");
		int shift=sc.nextInt();
		int arr[]= {10,20,30,40,50};
	
		for(int j=0;j<=shift;j++)
		{int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			 arr[i] = arr[i - 1];
		}
		arr[0]=temp;
		shift--;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		

}
}
