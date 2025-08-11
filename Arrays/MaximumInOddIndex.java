package Arrays;

import java.util.Arrays;

public class MaximumInOddIndex {
	public static void main(String[] args) {
		int[] arr = {3,4,6,3,2};
		int size=arr.length;
		int[] res = new int[size/2];
		int pos=0;
		for(int i=0;i<size;i++)
		{
			if(i%2!=0)
			{
				res[pos]=arr[i];
				pos++;
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<res.length;i++)
		{
		if(res[i]>max)
			max=res[i];
		}
		System.out.println("Maximum in odd Index: "+max);
	}
		
	}

