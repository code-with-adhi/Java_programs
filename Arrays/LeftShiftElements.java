package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftShiftElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of shifts:");
		int shift=sc.nextInt();
		int arr[]= {10,20,30,40,50};
	
		   for (int j = 0; j < shift; j++) {
	            int temp = arr[0]; 
	            for (int i = 0; i < arr.length - 1; i++) {
	                arr[i] = arr[i + 1]; 
	            }
	            arr[arr.length - 1] = temp; 
		   }
		
		System.out.println(Arrays.toString(arr));
		
		
		

}
}
