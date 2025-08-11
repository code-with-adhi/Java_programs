package Arrays;

import java.util.Arrays;

public class Maximum {
			public static void main(String[] args) {
				int arr[]= {9,6,1,7,9};
				System.out.println("Maximum of the array: ");
				System.out.println(max(arr));
				System.out.println(maximum(arr));
				
			}
			public static int max(int arr[])
			{ 
				for(int i=0;i<arr.length-1;i++)
				{
					for(int j=i+1;j<arr.length-1;j++)
					{
					
					if(arr[i]>arr[j])
						{int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						}
				}
				}
			
				System.out.println(Arrays.toString(arr));
				int max=arr[arr.length-1];
				return max;
			}
			public static int maximum(int arr[])
			{
				int max=Integer.MIN_VALUE;
				for(int i=0;i<arr.length;i++)
				{
				if(arr[i]>max)
				max=arr[i];
				}
				return max;
			}

		}

       


