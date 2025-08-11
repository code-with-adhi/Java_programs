package Arrays;

import java.util.Arrays;

public class MinimumInEvenIndex {
	public static void main(String[] args) {
		int[] arr = {3,4,5,6,3,2};
		int size=arr.length;
		int[] res = new int[size/2];
		int pos=0;
		for(int i=0;i<size;i++)
		{
			if(i%2==0)
			{
				res[pos]=arr[i];
				pos++;
			}
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<res.length;i++)
		{
		if(res[i]<min)
			min=res[i];
		}
		System.out.println("Minimum in even Index: "+min);
	}
		
	}

