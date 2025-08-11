package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfElementsUsingIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter elements of the array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Even Index Sum: "+evenIndexSum(arr));
		System.out.println("Odd Index Sum: "+oddIndexSum(arr));
		
	}
	public static int evenIndexSum(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
				sum+=arr[i];
		}

		return sum;
	}
	public static int oddIndexSum(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
				sum+=arr[i];
		}

		return sum;
	}

}
