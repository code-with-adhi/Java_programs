package Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class RemoveOddEvenIndexElements {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int arr[]= {10,20,30,40,50};
			System.out.println(Arrays.toString(arr));
			oddIndex(arr);
			evenIndex(arr);
		}
		public static void oddIndex(int arr[])
		{
			
			int[] res = new int[arr.length/2];

				int pos=0;
				for(int i=0;i<arr.length;i++)
				{
					if(i%2!=0)
						{res[pos++]=arr[i];
					}
				}
				System.out.println(Arrays.toString(res));
		
		}
		public static void evenIndex(int arr[])
		{
			
			int[] res = new int[(arr.length+1)/2];

				int pos=0;
				for(int i=0;i<arr.length;i++)
				{
					if(i%2==0)
						{res[pos++]=arr[i];
					}
				}
				System.out.println(Arrays.toString(res));
		
		}

}
