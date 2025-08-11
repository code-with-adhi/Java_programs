package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SubArraysOfTheArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size = sc.nextInt();	
		int[] arr = new int[size];
		System.out.println("Enter elements of the array: ");
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				for(int k=i;k<=j;k++)
					System.out.print(arr[k]+" ");
				System.out.println();
			}
			}
		}
	}
