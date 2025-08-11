package Arrays;
import java.util.Arrays;

public class SecondMinimum {
	
		public static void main(String[] args) {
			int arr[]= {9,6,1,7,9};
			System.out.println("Minimum of the array: ");
			System.out.println(secondminimum(arr));
			
			
		}
		
		public static int secondminimum(int arr[])
		{
			
				int min,smin;
				min=smin=Integer.MAX_VALUE;
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]<min)
					{
						smin=min;
						min=arr[i];
					}
					else if(arr[i]<smin && arr[i]!=min)
						smin=arr[i];
				}
				
				return smin;
		}

	}
