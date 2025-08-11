package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class AverageFromHalvesOfArray {
	public static void main(String[] args) {
		int[] arr= {1,3,3,2,4};
		System.out.println(Arrays.toString(arr));
		System.out.println("Average of first Half: "+firstHalf(arr));
		System.out.println("Average of second Half: "+secondHalf(arr));
	}
	public static double firstHalf(int arr[])
	{
		int mid=arr.length/2,sum=0,count=0;
		for(int i=0;i<mid;i++)
		{
			sum+=arr[i];
			count++;
		}
		
		
		return sum/count;
		
	}
	public static double secondHalf(int arr[])
	{
		int mid=arr.length/2,sum=0,count=0;
		for(int i=mid;i<arr.length;i++)
		{
			sum+=arr[i];
			count++;
		}
			
		return sum/count;
	}

}
