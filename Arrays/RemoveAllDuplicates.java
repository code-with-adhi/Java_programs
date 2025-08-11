package Arrays;

import java.util.Arrays;

public class RemoveAllDuplicates {
	public static void main(String[] args) { 
		int arr[]= {4,2,3,3,3,8,4};
		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
			if(arr[i]==arr[j])
			{
				arr[j]=Integer.MIN_VALUE;
			}
			
			}
		}
		int count=0;
		for(int x:arr)
		{
			if(x==Integer.MIN_VALUE)
			{
				count++;
				
			}
			
		}
		int arrd[]=new int[arr.length-count];
		
		
			int pos=0;
			for(int x:arr)
			{
				if(x!=Integer.MIN_VALUE)
					arrd[pos++]=x;
			}
			System.out.println(Arrays.toString(arrd));
		
		
		}
		
		
	}


