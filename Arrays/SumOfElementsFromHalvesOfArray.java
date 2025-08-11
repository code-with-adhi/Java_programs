package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfElementsFromHalvesOfArray {
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
		System.out.println("Sum of first Half: "+firstHalf(arr));
		System.out.println("Sum of second Half: "+secondHalf(arr));
	}
	public static int firstHalf(int arr[])
	{
		int mid=arr.length/2,sum=0;
		for(int i=0;i<=mid-1;i++)
			sum+=arr[i];
		return sum;
		
	}
	public static int secondHalf(int arr[])
	{
		int mid=arr.length/2,sum=0;
		for(int i=mid;i<=arr.length-1;i++)
			sum+=arr[i];
		return sum;
	}

}
