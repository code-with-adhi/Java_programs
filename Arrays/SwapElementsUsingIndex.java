package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElementsUsingIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index 1: ");
		int i1=sc.nextInt();
		System.out.println("Enter index 2: ");
		int i2=sc.nextInt();
		int arr[]= {10,20,30,40,50};
			int temp=arr[i1];
			arr[i1]=arr[i2];
			arr[i2]=temp;
		System.out.println(Arrays.toString(arr));
		
		
	}

}
