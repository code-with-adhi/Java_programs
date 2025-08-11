package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDupliateElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		int element=sc.nextInt();
		int count=0;
		boolean found=false;
		int arr[]= {10,20,10,40,10};
		for(int a:arr)
		{
			if(a==element)
				{count++;
			found=true;}
		}
		int[] res = new int[arr.length-count];
		if(found)
		{
			
			int pos=0;
			for(int a:arr)
			{
				if(a!=element)
					res[pos++]=a;
			}
				System.out.println(Arrays.toString(res));
			
			
			
		}
		else
			System.out.println("Element not found");
	}


}
