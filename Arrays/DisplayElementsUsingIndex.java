package Arrays;

import java.util.Arrays;

public class DisplayElementsUsingIndex {
	public static void main(String[] args) {
		int arr[]= {1,4,2,5,2,7};
		System.out.println(Arrays.toString(arr));
		System.out.println("Even Index: "+Arrays.toString(evenIndex(arr)));
		System.out.println("Even Index: "+Arrays.toString(oddIndex(arr)));
		
		
	}
	public static int[] evenIndex(int arr[])
	{
		int[] res=new int[arr.length/2];
		int pos=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				res[pos]=arr[i];
				pos++;
			}
		}
		return res;
	}
	public static int[] oddIndex(int arr[])
	{
		int[] res=new int[arr.length/2];
		int pos=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				res[pos]=arr[i];
				pos++;
			}
		}
		return res;
		
	}

}
