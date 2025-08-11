package Arrays;

import java.util.Arrays;

public class MaximumFromHalvesOfArray {
	public static void main(String[] args) {
		int[] arr = {1,4,2,4,5,2};
		System.out.println(Arrays.toString(arr));
		System.out.println("Maximum first Half: "+firstHalf(arr));
		System.out.println("Maximum second Half: "+secondHalf(arr));
	}
	public static int firstHalf(int arr[])
	{
		int mid=arr.length/2;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<mid;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
			
		
	}
	public static int secondHalf(int arr[])
	{
		int mid=arr.length/2;
		int max=Integer.MIN_VALUE;
		for(int i=mid;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}

	

}
