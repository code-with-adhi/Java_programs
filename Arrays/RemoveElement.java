package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		int element=sc.nextInt();
		boolean found=false;
		int arr[]= {10,20,30,40,50};
		for(int a:arr)
		{
			if(a==element)
				found=true;
		}
		int[] res = new int[arr.length-1];

		if(found)
		{
			
			int pos=0;
			for(int a:arr)
			{
				if(a!=element)
					{res[pos++]=a;
				}
			}
			System.out.println(Arrays.toString(res));
			
		}
		else
			System.out.println("Element not found");
	}

}
