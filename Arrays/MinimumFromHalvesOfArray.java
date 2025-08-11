package Arrays;

import java.util.Arrays;
public class MinimumFromHalvesOfArray {
	
		public static void main(String[] args) {
			int[] arr = {1,4,2,4,5,2};
			System.out.println(Arrays.toString(arr));
			System.out.println("Minimum first Half: "+firstHalf(arr));
			System.out.println("Minimum second Half: "+secondHalf(arr));
		}
		public static int firstHalf(int arr[])
		{
			int mid=arr.length/2;
			int min=Integer.MAX_VALUE;
			for(int i=0;i<mid;i++)
			{
				if(min>arr[i])
					min=arr[i];
			}
			return min;
				
			
		}
		public static int secondHalf(int arr[])
		{
			int mid=arr.length/2;
			int min=Integer.MAX_VALUE;
			for(int i=mid;i<arr.length;i++)
			{
				if(min>arr[i])
					min=arr[i];
			}
			return min;
		}

	}

