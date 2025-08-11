package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementUsingIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,40,50};
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the index");
		int index=sc.nextInt();
		boolean found=false;
		for(int i=0;i<arr.length;i++)
		{
			if(i==index)
				found=true;
		}
		int[] res = new int[arr.length-1];

		if(found)
		{
			
			int pos=0;
			for(int i=0;i<arr.length;i++)
			{
				if(i!=index)
					{res[pos++]=arr[i];
				}
			}
			System.out.println(Arrays.toString(res));
			
		}
		else
			System.out.println("Index not found");
	}

}
